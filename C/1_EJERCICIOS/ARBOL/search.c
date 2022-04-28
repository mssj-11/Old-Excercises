#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <unistd.h>
#include "queue.h"
#include "hash.h"
#include "domain.h"
#include "search.h"
#include <sys/time.h>
#include <sys/resource.h>

struct {
  enum {BREADTH,DEPTH} fringeInsertion;
  int (*algorithm)();
  char verbose;
} options;

struct {
  unsigned int expandedNodes;
  struct rusage resources;
} statistics;


int inPath(tSearchNode *node,tState *s) {
  while (node!=NULL) {
    if (stateEqual(node->state,s)) return 1;
    node=node->parent;
  }
  return 0;
}

QUEUE expand(tSearchNode *node) {
  QUEUE successors=qEMPTY;
  unsigned op;

  for (op=0;op<NUM_OPERATORS;op++)
    if (executable(op,node->state)) {
      tSearchNode *new;
      tState *s=successorState(op,node->state);
      
      if (options.fringeInsertion==DEPTH && inPath(node->parent,s))      
        free(s); 
      else {
	new=(tSearchNode *)malloc(sizeof(tSearchNode));
	new->state=s;
	new->parent=node;
	new->action=op;
	new->pathCost=node->pathCost + cost(op,node->state);
	new->depth=node->depth+1;

	qInsertLast(&successors,&new,sizeof(tSearchNode *));
      }
    }
  statistics.expandedNodes++;
  return successors;
}



void printReversePath(tSearchNode *node) {
  if (node->parent==NULL) return;

  printReversePath(node->parent);
  showOperator(node->action);
  if (options.verbose) {
    printf("\n");
    showState(node->state);
    printf("\n");
  }
  else printf("; ");
}



void printSolution(tSearchNode *node) {
  printf("Solution: \n");
  printReversePath(node);
  printf("\nDepth=%d\n",node->depth);
  printf("Cost=%d\n",node->pathCost);
}


void insertNode(QUEUE *fringe,tSearchNode **n) {
  switch(options.fringeInsertion) {
    case BREADTH:
      qInsertLast(fringe,n,sizeof(tSearchNode *)); break;
    case DEPTH:
      qInsertFirst(fringe,n,sizeof(tSearchNode *)); break;
  }
}

tSearchNode *rootNode() {
  /* Create the root node */
  tSearchNode *root=(tSearchNode *)malloc(sizeof(tSearchNode));
  root->state=initialState();
  root->parent=NULL;
  root->pathCost=0;
  root->depth=0;
  return root;
}

int treeSearch() {
  tSearchNode *node,*n,*root=rootNode();
  QUEUE fringe=qEMPTY,successors;
  
  qInsertFirst(&fringe,&root,sizeof(tSearchNode *));
  while (1) {  
    if (qIsEmpty(fringe)) return 0;
    qPOP(&fringe,&node,sizeof(tSearchNode *));
    
    if (goalTest(node->state)) {printSolution(node); return 1;}
    
    successors = expand(node);
    while (!qIsEmpty(successors)) {
      qPOP(&successors,&n,sizeof(tSearchNode *));
      insertNode(&fringe,&n);
    }    
  }
  
}

int graphSearch() {
  tSearchNode *node,*n,*root=rootNode();
  QUEUE fringe=qEMPTY,successors;
  tHashTable *closed=hashCreate(10007,sizeof(tState));
  tHashEntry e;
 
  qInsertFirst(&fringe,&root,sizeof(tSearchNode *));

  while (1) {
    if (qIsEmpty(fringe)) return 0;
    qPOP(&fringe,&node,sizeof(tSearchNode *));

    if (goalTest(node->state)) {printSolution(node); return 1;}

    e.key=node->state;
    if (hashFind(closed,&e)) {  /* already visited state */
      free(node->state);
      free(node);
      continue;
    }

    hashInsert(closed,node->state,NULL);    
    
    successors = expand(node);
    while (!qIsEmpty(successors)) {
      qPOP(&successors,&n,sizeof(tSearchNode *));
      insertNode(&fringe,&n);
    }    
  }

}

extern char *optarg;
extern int optind;

int main (int argc,char *argv[]) {
  /* Processing options */
  int c;
  
  options.algorithm=treeSearch;
  options.fringeInsertion=BREADTH;
  options.verbose=0;
  statistics.expandedNodes=0;

  while ((c = getopt(argc, argv, "a:f:v")) != EOF) {
    switch (c) {
      case 'a':
	  if (!strcmp(optarg,"tree"))
	    options.algorithm=treeSearch;
	  else {
	    if (!strcmp(optarg,"graph"))
	      options.algorithm=graphSearch;
	    else {
	      printf("Unrecognized algorithm %s.\n",optarg); exit(1);
	    }
	  }
	  break;
      case 'f':
	  if (!strcmp(optarg,"breadth"))
	    options.fringeInsertion=BREADTH;
	  else {
	    if (!strcmp(optarg,"depth"))
	      options.fringeInsertion=DEPTH;
	    else {
	      printf("Unrecognized type of fringe insertion %s.\n",optarg); exit(1);
	    }
	  }
	  break;
      case 'v': options.verbose=1;break;
      case 'h':
      case '?': 
            printf("search -a <algorith_mname> -f <fringe_insertion>");
    }
  }

  if (!(options.algorithm()))
    printf("No solution.\n");
  printf("%d expanded nodes.\n",statistics.expandedNodes);
  getrusage(RUSAGE_SELF,&statistics.resources);
  printf("%ld.%03ld seconds.\n",
    statistics.resources.ru_utime.tv_sec,
    statistics.resources.ru_utime.tv_usec/1000);
}
#include <stdio.h>	//Incluir biblioteca para imprimir
#define DATO 4	//Definiendo una constante llamada (DATO) con valor (4)

//Iniciando el programa
main(){
	//	Declaracion de las variables
	int x, y=1;	//	Almacenando valores enteros
	float z;	//	Para Almacenar valores reales
	
	
	x = (3/2) + (10-3);	// Asignacion de la expresion dandole un valor a X = 8 
	z = (3.0/2.0) + (10-3);	//	Asignacion de la expresion dandole un valor a Z = 8.5
	
	printf("************************************************************************\n");
	printf("\nEvaluacion de Expresiones Aritmeticas (Relacionales y Logicas)\n");
	printf("************************************************************************\n");
	
	printf("\n%d - %f\n", x, z);	//	Imprimiendo los valores de X y Z
	printf("%d \n", DATO*(3+1/2));	//	Imprimiendo el valor de la evaluacion de la expresion (producto y division)
	printf("%d \n", (5+2) - 1>5);	//	Evaluacion de la expresion aritmetica >, despues la exprseion relacional resultante (6>5) la cual es verdadera y da resultado a 1 
	printf("%d \n", 3>1 || DATO*2<1);	//	Expresion logica (3<1), es verdaro y DATO*2<1 es falso, La Exp.Log. es OR y uno de los dos operadores es verdadero por lo tanto da 1 
	printf("%d \n", 5!=1 && DATO>2);	//	Operandos de la Exp.Log. (5!=1), es verdadero y DATO>2 , es verdadero, entonses la Exp.Log. es AND = 1
	y = x;	//	Asigancion entre las 2 variables, el valor se toma de Derecha a Izq. Es decir x=8, Entonces tanto X como Y tienen como valor 8
	printf("%d \n", x+y<=z);	//	Sustitusion de variables por su contenido: 8+8<=8.5 , lo que hace a la expresion falsa, es decir 0
}
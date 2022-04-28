/*
	Mostrar el resultado de la ecuacion a=b^2 + 1, esto para distintos valores de b (0,2 y -2)
	¿Es correcto?, Si no lo es, escribir el programa correctamente
*/
#include <stdio.h>

//Iniciando el programa
main(){
	
	int a, b=0;	//	Declaracion de las variables A con valor indeterminado y B=0
	
	printf("\nEcuacion a=b^2 + 1, con distintos valores para b (0,2 y -2)\n");
	
	
	a = b*b+1;	//	Evaluando la sig. Expre. (0*0)+1 =1, Es decir A=1 y B=0
	printf("\nSi b=%d, entonces a=%d\n", b, a);	//	Entonces si B=0, entonces A=1
	
	b=2;	//	Asignando el valor 2 a B, Entonces A=1 y B=2, Seria incorrecto ya que a=b^2 +1, da como resultado B=2 y A=5, Entonces creamos una expresion para otra variable b
	a = b*b+1;	// Asignacion sobre la variable (A) para cada cambio de la variable B
	printf("\nSi b=%d, entonces a=%d\n", b, a);	//	Entonces si B=2, entonces A=5
	
	b=-2;	//	Asignado el valor -2 a B
	a = b*b+1;	//	Otra asignacion a la variable A 
	printf("\nSi b=%d, entonces a=%d\n", b, a);	//	Entonces si B=-2, entonces A=5
}
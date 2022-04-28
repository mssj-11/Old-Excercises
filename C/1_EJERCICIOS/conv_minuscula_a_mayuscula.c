/*
	Escribir un programa que lea un caracter en minusculas e imprima 
	en pantalla el mismo caracter en mayusculas
*/
#include <stdio.h>

main(){
	
	//	Creacion de variables tipo char para almacenar un valor entero más chico (en el rango de -128 a 127)
	char minuscula, mayuscula;
	
	//	Lectura de datos: minuscula
	printf("\nIntroduce un caracter en minuscula: ");
	scanf("%c", &minuscula);
	
	//	Proceso: Transformacion a mayuscula (-32 -> Conversion ASCII )
	mayuscula = minuscula - 32;
	
	//	Salida de datos
	printf("\nEl caracter %c en mayuscula es %c\n", minuscula, mayuscula);
}
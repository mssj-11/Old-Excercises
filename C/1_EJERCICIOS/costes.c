/*	
	Una empresa de venta de recambios de automoviles necesita un programa que calcule
	y muestre el precio final en euros de un producto, Utilizando la sig. Formula:
	precio_neto = precio_coste * (100+margen / 100)
*/
#include <stdio.h>

/*
	Programa que calcula el precio neto de un producto de
	una empresa de venta de recambios de automoviles
*/

main(){
	
	//	Declaracion de variables para agregar valores enteros y/o con decimal decimales
	float precio_neto, precio_coste, margen;
	
	//	Entrada de datos: precio_coste y margen
	printf("\nCual es el precio de coste? ");
	scanf("%f", &precio_coste);
	
	printf("\nCual es el margen?");
	scanf("%f", &margen);
	
	//	Proceso: Calculo del precio Neto
	precio_neto = precio_coste * (100*margen)/100;
	
	//	Salida de datos
	printf("\nEl precio neto de este producto es de %f euros\n", precio_neto);
}
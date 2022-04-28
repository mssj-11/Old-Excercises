/*
	La empresa que fabrica un modelo de maquinas expendedoras de refrescos necesita un programa para estas maquinas, que 
	puedan realizar el calculo de cuantas monedas de cada tipo deben devolver. En primer lugar, se introducira la cantidad
	a devolver en euros (multiplo de 5 centimos, ya que es la moneda mas pequeña disponible), es decir, se tecleara 1.85 
	para 1 euro con 85 centimos, el programa debera devolver por pantalla cuantas monedas de cada tipo hay que devolver.
	Teniendo en cuanta que: 
	-Se dispone de monedas de 50 centimos, 20 centimos, 10 centimos y 5 centimos
	-Siempre se dispone de las monedas necesarias de cada tipo
	-Se debe devolver el menor numero de monedas posible, es decir intentar devolver las monedas de mayor valor
*/
#include <stdio.h>
//	Opcion 1 - solo para la moneda mas grande	
/*
main(){
	
	//	Valibles para la cantidad de euros a devolver
	float euros_a_devolver, falta_por_devolver;
	//	Variables para las Monedas
	int mon_50c, mon_20c, mon_10c, mon_5c;
	
	//	Lectura de los datos: euros_a_devolver
	printf("\nEuros a devolver: ");
	scanf("%f", &euros_a_devolver);
	
	//	Proceso para la devolucion del cambio
	falta_por_devolver = euros_a_devolver;
	
	mon_50c = falta_por_devolver / 0.5;
	falta_por_devolver = falta_por_devolver - 0.5*mon_50c;
	
	mon_20c = falta_por_devolver / 0.2;
	falta_por_devolver = falta_por_devolver - 0.2*mon_20c;
	
	mon_10c = falta_por_devolver / 0.1;
	falta_por_devolver = falta_por_devolver - 0.1*mon_10c;
	
	mon_5c = falta_por_devolver / 0.05;
	
	//	Salida de los datos (cambio)
	printf("\nLa cantidad de %f euros se devolveran asi: ", euros_a_devolver);
	printf("\n-%d monedas de 50 Centimos ", mon_50c);
	printf("\n-%d monedas de 20 Centimos ", mon_20c);
	printf("\n-%d monedas de 10 Centimos ", mon_10c);
	printf("\n-%d monedas de 5 Centimos ", mon_5c);
}*/

//	Opcion con centimos
main(){
	
	//	Valibles para la cantidad de euros a devolver
	float euros_a_devolver;
	int falta_por_devolver;
	//	Variables para las Monedas
	int mon_50c, mon_20c, mon_10c, mon_5c;
	
	//	Lectura de los datos: euros_a_devolver
	printf("\nEuros a devolver: ");
	scanf("%f", &euros_a_devolver);
	
	//	Proceso para la devolucion del cambio
	falta_por_devolver = euros_a_devolver*100.0;
	
	mon_50c = falta_por_devolver / 50;
	falta_por_devolver = falta_por_devolver - 50*mon_50c;
	
	mon_20c = falta_por_devolver / 20;
	falta_por_devolver = falta_por_devolver - 20*mon_20c;
	
	mon_10c = falta_por_devolver / 10;
	falta_por_devolver = falta_por_devolver - 10*mon_10c;
	
	mon_5c = falta_por_devolver / 5;
	
	//	Salida de los datos (cambio)
	printf("\nLa cantidad de %f euros se devolveran asi: ", euros_a_devolver);
	printf("\n-%d monedas de 50 Centimos ", mon_50c);
	printf("\n-%d monedas de 20 Centimos ", mon_20c);
	printf("\n-%d monedas de 10 Centimos ", mon_10c);
	printf("\n-%d monedas de 5 Centimos ", mon_5c);
}
/*
	Una compañia de refrescos comercializa tres productos: Sabor de cola, naranja y de limon. Realizar un programa que 
	calcule las ventas realizadas de cada producto. Para ello, se leera la cantidad vendida (maximo 5,000,000) y el precio
	en euros de cada producto y se mostrara un informe de ventas como el siguuiente:
	
	**Producto**		**Ventas**		**Precio**		Total
		Cola			1,000,000			0.17		170,000.00
		Naranja			350,000				0.20		70,000.00
		Limon			530,000				0.19		1000,700.00
											TOTAL	=	340,700.00
*/
#include <stdio.h>
//	Mostrar total de ventas de varios productos
main(){
	
	long int ventas_cola, ventas_naranja, ventas_limon;
	float precio_cola, precio_naranja, precio_limon;
	float total_cola, total_naranja, total_limon;
	
	//	Lectura de datos: Ventas & el precio de cada Producto
	printf("\n:: Ingrese los datos de los productos ::\n");
	
	printf("\nDatos de la Cola \n");
	printf("\t	  Ventas: ");
	scanf("%ld", &ventas_cola);
	printf("\t	  Precio: ");
	scanf("%f", &precio_cola);
	
	printf("\nDatos de la Naranja \n");
	printf("\t	  Ventas: ");
	scanf("%ld", &ventas_naranja);
	printf("\t	  Precio: ");
	scanf("%f", &precio_naranja);
	
	printf("\nDatos del Limon \n");
	printf("\t	  Ventas: ");
	scanf("%ld", &ventas_limon);
	printf("\t	  Precio: ");
	scanf("%f", &precio_limon);
	
	
	//	Proceso del calculo
	total_cola = ventas_cola*precio_cola;
	total_naranja = ventas_naranja*precio_naranja;
	total_limon = ventas_limon*precio_limon;
	
	//	Salida de los datos obtenidos en el calculo
	printf("\n\n		  *** Informe De Ventas ***\n\n");
	
	printf("\nProducto	     Ventas		Precio		TOTAL\n");
	printf("--------------------------------------------------------------------\n");
	
	printf("Cola		  %7ld		%4.2f		%9.2f", ventas_cola, precio_cola, total_cola);
	printf("\nNaranja		  %7ld		%4.2f		%9.2f", ventas_naranja, precio_naranja, total_naranja);
	printf("\nLimon		  %7ld		%4.2f		%9.2f", ventas_limon, precio_limon, total_limon);
	
	printf("\n--------------------------------------------------------------------\n");
	
	printf("\n					TOTAL		%9.2f\n", total_cola + total_naranja + total_limon);
}
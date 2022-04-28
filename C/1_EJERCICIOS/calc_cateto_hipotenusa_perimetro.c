/*
	Progrma para calcular los valores de catetos de un triangulo rectangulo y este 
	calcule la hipotenusa, el area y el perimetro del triangulo mediante las sig.'s expresion
	
	h = √C1^2 + C2^2		A = √C1 * C2 / 2	p = h + C1 + C2
*/
#include <stdio.h>
#include <math.h>	//	Biblioteca para operaciones matemáticas básicas

main(){
	
	float cateto1, cateto2, hipotenusa, area, perimetro;
	
	//	Lectura de datos de entrada: cateto1 Y cateto 2
	printf("\nValor para el Cateto1? ");
	scanf("%f", &cateto1);
	
	printf("\nValor para el Cateto2? ");
	scanf("%f", &cateto2);
	
	//	Proceso: Calculo de la hipotenusa, del area y del perimetro
	hipotenusa = sqrt(cateto1*cateto1 + cateto2*cateto2);
	
	area = (cateto1*cateto2)/2.0;
	
	perimetro = cateto1+cateto2+hipotenusa;
	
	//	Salida de los resultados
	printf("\nLa hipotenusa es: %f\n", hipotenusa);
	printf("\nEl area es: %f\n", area);
	printf("\nEl perimetro es: %f\n", perimetro);
}	
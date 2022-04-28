/*
	Mostrar una lista de numeros del 1-20, indicando si el numero es divisible por 3 o no.
*/
#include <iostream>	//	Biblioteca para usar OUT
using namespace std;
//	Funcion principal
int main(){
	
	int numero;	//	Creacion de una Variable de tipo entero
	
	//	Creacion del bulce for para --> 1-20
	for(numero=1; numero<=20; numero++){
		
		cout << numero;	//Mostrando el numero
		
		//	Condicion if --> para verificar si el numero es multiplo de 3 o es igual a 0
		if(numero % 3 == 0)	
			cout << " Es multiplo de 3";	// Se resta == 0
			
		else//	Si no lo es
			cout << " No es multiplo de 3";	// Se resta != 0
			cout << endl;	//	Se realiza un cambio de linea
		
	}
	
	cin.get();
	return 0;		
}
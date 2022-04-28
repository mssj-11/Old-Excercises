/*	Numeros con la sig. secuencia:
	1,5,3,7,5,9,7,.....,23
*/
#include <iostream>
using namespace std;

int main(){
	
	int i = 1;
	bool sumar=true;
	bool terminar=false;
	
	do{
		cout<<i;	//Mostrando el numero
		terminar = (i==23);	//Actualizando la condicion para TERMINAR
		//	Condicion para la puntuacion y separacion
		if(terminar)
				cout<<" . ";
			else
				cout<<", ";
			//	Calculando el numero
		if(sumar)
			i += 4;
			else
				i-= 2;
				//Entonces cambia la operacion
				sumar = !sumar;
	}while(!terminar);	//Mientras este aun no se termine
	
	cout<< endl;	//Cambio de linea
	
	cin.get();
	return 0;
}
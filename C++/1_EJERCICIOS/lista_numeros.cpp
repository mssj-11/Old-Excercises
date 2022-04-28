//	mostrar lista de numeros, con salida de 20 lineas 
#include <iostream>
using namespace std;

int main(){
	
	int i, j;
	
	//	Bucle i = 20
	for (i=1; i<=20; i++){
		
		//	Bule de 1 a i
		for(j=1; j<=i; j++)
			cout<< j <<" "; //	Mostrando el numero
			cout << endl;	//	Cambio de linea
	}
	
	cin.get();
	return 0;
}
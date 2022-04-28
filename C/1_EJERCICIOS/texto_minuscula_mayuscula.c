/*
	
*/
#include <stdio.h>
#include <ctype.h>
 
int main(int argc, char const *argv[]){
	
	char cadena[30];
	printf("Escribe texto en minuscula: ");
    scanf("%s", cadena); // 
 
	// Convertir cada char a mayúscula
	// usando toupper
	for (int indice = 0; cadena[indice] != '\0'; ++indice){
		cadena[indice] = toupper(cadena[indice]);
	}
	printf("Cadena convertida a mayuscula: %s\n", cadena);
	return 0;
}
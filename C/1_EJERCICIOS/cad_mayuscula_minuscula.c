/*
	
*/
#include <stdio.h>
#include <ctype.h>
 
int main(int argc, char const *argv[]){
	
	char cadena[30];
	printf("Escribe texto en mayuscula: ");
    scanf("%s", cadena); // 
 
	// Convertir cada char a minúscula
	// usando tolower
	for (int indice = 0; cadena[indice] != '\0'; ++indice){
		cadena[indice] = tolower(cadena[indice]);
	}
	printf("Cadena convertida a minuscula: %s\n", cadena);
	return 0;
}
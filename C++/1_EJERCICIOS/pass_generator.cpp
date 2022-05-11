#include <iostream>
# include <time.h>
using namespace std;

//	Main Function
int main(){
	
	srand(time(0));	// seending for random
	string pass;
	
	// All Data
	string data = "abcdefghijklmnopqrstuvwxyz"
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				"0123456789"
				"[-+.^:,]={}~(!*&%$#@%)¿?";
	
	for (int i=1; i<=12; i++){
		
		pass = pass + data[rand() % 93];	// getting generated
	}
	
	cout<< "You password is: "<<pass;	// Print password
	return 0;
	
}
package main

import "fmt"

func main() {
	// printf se utiliza para formatear su salida
	price := 13.44456
	// print float como están las cosas
	fmt.Printf("Price as original: %f\n", price)
	// redondear hasta 2 decimales
	fmt.Printf("Price with 2 decimal places: %.2f\n", price)
	// print en notación exponencial
	fmt.Printf("Price with exponent notation %e\n", price)

	// convertir el precio a int y luego imprimir
	fmt.Printf("Price as integer: %d\n", int(price))

	name := "Anil Kulkarni"
	// imprimiendo un string
	fmt.Printf("Hi, %s\n", name)

	// crear un custom string
	greeting := fmt.Sprintf("Hi with Sprintf, %s", name)
	fmt.Println(greeting)

	// string con concatenación
	fmt.Println("Go" + "pher")

	// Imprimir solo un character
	fmt.Printf("Character: %c\n", name[0])
	fmt.Printf("Quoted Character: %q\n", name[0])
	fmt.Printf("Quoted String: %q\n", name)

	num := 200
	// Imprimir como binario
	fmt.Printf("Binary: %b\n", num)

	// imprimir con el estilo predeterminado
	fmt.Printf("Default: %v\n", num)
	fmt.Printf("Default: %v\n", price)
	fmt.Printf("Default: %v\n", name)

	// Caracteres de escape
	fmt.Println("My best friends name is \"Robby\"")
	fmt.Println("Escaping backslash: 4\\2")
}
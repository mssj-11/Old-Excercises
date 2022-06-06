package main

import "fmt"

// Declarando una variable global
var num int = 9

// Declarando una constante
const apiKey string = "1234-asdf-o3s9"

func main() {
	// Declarando variable multiples
	var (
		// strings use utf-8 encoding
		name string
		// initializing variable with value
		luckyNum int = 13
	)
	// Short hand declaration, the data type is inferred by compiler
	day := "Sunday"

	// Assign value to variable
	name = "Anil Kulkarni"

	fmt.Println(num)
	fmt.Println(apiKey)
	fmt.Println(name)
	fmt.Println(luckyNum)
	fmt.Println(day)
}
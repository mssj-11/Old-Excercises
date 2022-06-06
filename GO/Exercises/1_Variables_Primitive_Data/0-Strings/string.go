package main

import "fmt"

func main() {

	// strings pueden contener caracteres Unicode
	status := "I love the rainbow 🌚"
	fmt.Println(status)

	// strings Puede ser indexado
	fmt.Printf("The first character of status is: %q\n", status[0])

	// strings con solo fragmentos de bytes de solo lectura
	alphabets := "abcd"
	fmt.Printf("alphabets as code points: % d", []byte(alphabets))
	fmt.Println()

	// No hay concepto de caracteres, en cambio, son solo bytes o rune
	char := 'a'
	fmt.Printf("Char 'a': %v\n", char)
	fmt.Printf("Char 'a': %c\n", char)
	// rune es solo un alias para el tipo int32
	fmt.Printf("Char 'b': %c\n", char+1)

	rainbow := "🌚"
	// Aunque aparezca 🌚  es un solo character,
	// la longitud es en realidad 4 bytes.
	fmt.Printf("The length of 🌚 is: %d bytes\n", len(rainbow))
	fmt.Printf("🌚 as list of bytes: %v\n", []byte(rainbow))

	// Convertir cadena en rune
	fmt.Printf("The Unicode of 🌚 is: %U\n", []rune(rainbow))

	// recorriendo strings
	name := "ESPAÑOL"
	for index, runeValue := range name {
		fmt.Printf("%#U starts at byte position %d\n", runeValue, index)
	}

	fmt.Println()
}
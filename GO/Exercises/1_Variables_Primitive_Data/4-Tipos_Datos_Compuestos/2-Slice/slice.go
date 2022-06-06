package main

import "fmt"

func main() {

	// declarar un slice de tipo int
	var nums []int
	fmt.Println(nums)
	fmt.Printf("Capacity: %d\tLength: %d\n", cap(nums), len(nums))

	// añadir elemento a slice
	nums = append(nums, 2)
	fmt.Println(nums)

	// comprobando la nueva capacidad y longitud
	fmt.Printf("Capacity: %d\tLength: %d\n", cap(nums), len(nums))

	// literal slice 
	names := []bool{true, true, true, false}
	fmt.Println(names)

	// declarando un array
	cities := [5]string{"Mumbai", "Delhi", "Toronto", "Perth", "Oslo"}

	// crear un slice y asignar ciudades,
	// mas en `slice operations`
	cityChoices := cities[0:3]
	fmt.Println(cityChoices)

	// slice no crea nueva memoria, sino que apunta a la subyacente array,
	// Nosotros estudiaremos mas sobre slice en `slice internals`
	cities[1] = "Dublin"
	fmt.Println(cityChoices)
}
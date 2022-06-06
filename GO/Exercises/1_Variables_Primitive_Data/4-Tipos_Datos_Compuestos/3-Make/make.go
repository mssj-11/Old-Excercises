package main

import "fmt"

func main() {

	// crear un tamaño cero slice
	var nilNums []int
	fmt.Println(nilNums)
	fmt.Printf("Capacity: %d\tLength: %d\n", cap(nilNums), len(nilNums))

	// hacer crea y asigna
	// hacer que se inicialice al valor cero del tipo
	nums := make([]int, 5, 10)
	fmt.Println(nums)
	fmt.Printf("Capacity: %d\tLength: %d\n", cap(nums), len(nums))

	// realizar operaciones regulares en un slice
	newNums := nums[1:5]
	fmt.Println(newNums)
}
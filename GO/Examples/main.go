package main

func main(){
	suma(2,5)
	sumaRecortada(2,6)
	fmt.Println(sumaRetorno(2,3))
	fmt.Println(sumaCombinada(2,3,4))
	fmt.Println(sumaCombinadaNombrada(2,3,4))
}

func suma (x int , y int){
	fmt.Println(x + y)
}

func sumaRecortada (x,y int)  {
	fmt.Println(x + y)
}

func sumaRetorno(x int , y int) int{
	return x+y
}

func sumaCombinada(x int ,y int, z int) (int , int){
	return x+y , x+z
}

//Diferente manera de realizar la funcion de arriba
func sumaCombinadaNombrada(x int ,y int, z int) (l int , j int){
	l=x+y
	j=x+z

	return 
}
////////////////////////////////////////////////////////////
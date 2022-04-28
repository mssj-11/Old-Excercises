//CONDICIONALES para romper flujos de los FOR
package condicionales

import{
	"ftm"
}


func main(){
	i:=0

	//DEFINIENDO un if (true or false)
	if i == 10 {//comparando i con 10
		ftm.Println("i es 10")
	}

	j:=5
	//SUGAR syntaxis
	//res := i + j	//en el caso de que se quiera seguir trabajando con la variable res por fuera del if
	if res := i + j; res < 20{// res := i + j; --> esta empleado solo para ser usado dentro de el if
		ftm.Println("Aprovado")
		ftm.Println(res)
	}
	//ftm.Println(res)	//en caso de volver a hacer uso de la variable res 

	//EJEMPLO DEL USO DE LA VARIABLE res despues del if
	res := i + j	
	if res > 20{
		ftm.Println("Aprovado")
		ftm.Println(res)
	}
	ftm.Println(res)	

	//Nueva variable
	if res > 20{
		nombre:="Mike"	//esta variable se creo dentro del if ∴ no estara disponible fuera del if
		ftm.Println(nombre)
	}
	//ftm.Println(nombre) //-->variable no definida fuera del if


	//EJEMPLO IF ELSE
	//si la primer condicion se cumple --> entonces
	res := i + j	
	if res > 20{
		ftm.Println("Aprovado")
		ftm.Println(res)
	}else{
		ftm.Println("suspendido")
	}
	ftm.Println(res)

}
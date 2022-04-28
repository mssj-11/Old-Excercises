//VARIABLES PRIMITIVAS
package variables

import{
	"ftm"
}


func main(){
	var i int = 5
	var j string ="hola"
	ftm.Println(i)
	ftm.Println(j)

	//MEJOR FORMA DE DEFINIR VARIABLES
	v:=5
	c:="mundo"
	ftm.Println(v)
	ftm.Println(c)

	//ejemplos para multiplicar un entro con un float
	//ejemplo 1
	/*var v float64 =5
	precio :=2.5
	ftm.Println(v * precio)*/

	//ejemplo 1
	/*v:= float64(5)//crea un nuevo objeto/variable y le asigna el valor
	precio :=2.5
	ftm.Println(v * precio)*/


}
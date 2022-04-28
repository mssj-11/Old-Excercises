package bucles

import{
	"ftm"
}

func main(){
	//sumando valores
	resultado :=0

	//EJEMPLO DE BUCLES
	//FOR
	for i:=0; i<1000; i++ {
		resultado +=1
		//sumando 1 al igual que la linea de arriba
		/*resultado++*/
	}
	ftm.Println(resultado)

	//WHILE
	resultado=1
	for resultado < 100 {
		ftm.Println(resultado)
		resultado += resultado
	}
	ftm.Println(resultado)

	//EN GO no existe el DO WHILE

	//BUCLE INFINITO ---> NO ES RECOMENDABLE emplearlo
	/*for {
		return //sirve para parar el bucle infinito
	}*/ //DESVENTAJA --> consume mucha memoria

}//compilar con --> go build para poder ver los dif procesos
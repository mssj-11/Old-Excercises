package switch

import {
	"ftm"
	"runtime"
}

func main(){
	//ftm.Println(runtime.GOOS)
	//	if encadenado
	if runtime.GOOS == "darwin"{
		ftm.Println("maCOS")
	}
	if runtime.GOOS == "linux"{
		ftm.Println("linux")
	}
	if runtime.GOOS == "windows"{
		ftm.Println("windows")
	}

	//LO MISMO DE ARRIBA (if) PERO CON SWITCH --> para mejor practica
	//SENTENCIA SWITCH
	switch os:=runtime.GOOS; os{//tomaremos el segundo (os)
	case "darwin":
		ftm.Println("maCOS")
	case "linux":
		ftm.Println("linux")
	case "windows":
		ftm.Println("windows")

		//en el caso de que si no es ninguno
	default:
		ftm.Println("No soportado por expresion")
		ftm.Println(os)
	}

	//ejemplo : --> SWITCH CASE
	ahora:= time.Now().Weekday()
	//ftm.Println(ahora + 1)// en vez del --> 1 ir probando con las diferentes case asignadas
	switch time.Saturday{//cambiar a saturday o sunday
	case ahora+0:
		ftm.Println("Hoy")
	case ahora+1:
		ftm.Println("Mañana")
	case ahora+2:
		ftm.Println("Pasado Mañana")
	default:
		ftm.Println("Relax: Aun queda Tiempo :)")

	}
}
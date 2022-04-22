package prueba;

public class Principal {//PARTE2: 1.-clase Principal

    public static void main(String[] args) {//PARTE2: 2.-metodo Main

        /*PruebaExamen pe = new PruebaExamen(){
            public void operacionPrueba(int n1, int n2, int n3) {
             pe = (n1, n2, n3) -> System.out.println("Resultado Suma 3 Numeros: "+(n1 + n2 + n3));
        }
        };*/
        PruebaExamen pe; //PARTE2: 3.-instancia prueba examen - sin memoria
        pe = (n1, n2, n3) -> System.out.println("Resultado Suma 3 Numeros: " + (n1 + n2 + n3));//PARTE2: 4.- asignar expresion LAMBDA a la instancia pe (sumando 3 numeros)
        pe.operacionPrueba(6, 7, 2);////PARTE2: 4.-captura de los numeros
        //Suma 2 numeros enteros-->Invocando metdodo "operacionPrueba"
        System.out.println("Resultado Suma 2 Numeros: " + PruebaExamen.operacionPrueba(3, 8));//PARTE2: 5.- Invocar "operacionPrueba" e imprimir el resultado de la suma de DOS números Enteros
        //Invocando metdodo "mensajeHola"
        pe.mensajeHola();//PARTE2: 6.- Invocar "mensajeHola"
        pe.mensajeHola("Mensaje String");//PARTE2: 7.- Invocar "mensajeHola" y enviar cualquier String.
        //PARTE2: 8.- Asignar una Expresión lambda a la instancia "pe"
        pe = (n1, n2, n3) -> System.out.println(n1 + " + -->(" + n2 + " * " + n3 + ")" + "--> El Resultado es: " + (n1 + (n2 * n3)));//PARTE2: suma del primer argumento con la división del segundo argumento entre el tercer argumento
        pe.operacionPrueba(2, 11, 11);//PARTE2: 9.-Argumentos [1, 2 & 3]

        miMetodo(pe);//PARTE2: 12.-invocar al método "miMetodo" pasando como argumento a "pe".
        //PARTE2: 13.- Invocar al método "miMetodo", pasando como argumento una Expresión lambda
        miMetodo((n1, n2, n3) -> System.out.println(n1 + " + -->(" + n2 + "/" + n3 + ") --> " + "El Resultado es: " + (n1 + (n2 / n3))));//PARTE2: 13.-suma del primer argumento con la división del segundo argumento entre el tercer argumento.
        miMetodo((x, y, z) -> System.out.println(x + " + -->(" + y + "/" + z + ") --> " + "El Resultado es: " + (x + (y * 1.0 / z))));//PARTE2: 16.-imprima la suma del primer argumento con la división del segundo argumento entre el tercer argumento (DEBE IMPRIMIR LOS DECIMALES)
        //miMetodo(pe, 7, 8, 3);//PARTE2:  17.-Invocar al método "miMetodo" y enviar como primer argumento a "pe", y tres Enteros cualesquiera.
    }

    private static void miMetodo(PruebaExamen cal) {//PARTE2: 10.-metodo estatico (sin retorno) --> recibe un argumento de tipo PruebaExamen
        cal.operacionPrueba(3, 4, 7);//PARTE2: 11.-repetir lo mismo que el punto "9", pero con el objeto que se recibe como argumento

    }

    private static void miMetodo(PruebaExamen cal2, int x, int y, int z) {//PARTE2: 14.-método estático y privado de nombre "miMetodo", el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen" & 3 de tipo ENTEROS
        cal2.operacionPrueba(x, y, z);//PARTE2: 15.-3 valores
    }
}

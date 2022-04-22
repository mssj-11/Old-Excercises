package prueba;

public interface PruebaExamen {//PARTE1:1.-Clase Intreface
    //NOTA: Una interfaz es una clase completamente Abstracta (Una clase sin implementacion)

    public abstract void operacionPrueba(int n1, int n2, int n3);//PARTE1:7.-metodo abstracto (sin retorno) & que recibira tres parámetros de tipo Entero

    //Metodos
    public default void mensajeHola() {//PARTE1:2.-metodo publico y por default "mensajeHola" 
        System.out.println("Mi nombre es: Michael Salgado Sotero");//PARTE1:3.-Impresion Mensaje
        //return; //PARTE1:2.-sin ningun retorno
    }

    public default void mensajeHola(String cadena) {//PARTE1:4.-metodo por defecto & publico con un String
        System.out.println("La cadena es: " + cadena);//PARTE1:4.-Impresion del mensaje ---> La cadena es: " + cadena
        //return;//PARTE1:4.- Sin retorno
    }

    //paraque se vea la diferencia de metodos puse un --> metodo double que recibira parametros enteros 
    public static double operacionPrueba(int a, int b) {//PARTE1:5.-metodo publico & estatico --> retornara un dato entero & va a recibir dos parámetros entero
        int suma = a + b;//PARTE1:5.-recibe los 2 parametros enteros
        return suma;//PARTE1:5&6.-retorna la suma de los dos argumentos --> suma [(2 ENTEROS) recibidos]
    }

}

package Ejemplo1;
// Ejemplo 1: Expresiones lambda sin parámetros
public class LambdaTest {

    public static void main(String[] args) {
        //Expresion LAMBDA = "Representa un objeto de una interface funcional"
        FunctionTest ft = () -> System.out.println("Hola Mundo"); // Implementacion del metodo abstracto "saludar()"
        //de la interfaz funcional
        //*****
        //ft.saludar();
        //*****
        //Esta es otra manera
        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(ft);

    }

    public void miMetodo(FunctionTest parametro) {
        parametro.saludar();

    }
}

package Ejemplo2;
// Ejemplo 2: Expresiones lambda sin parámetros
public class LambdaTest {

    public static void main(String[] args) {
        //Expresion LAMBDA = "Representa un objeto de una interface funcional"
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        //de la interfaz funcional
        //*****
        //op.imprimeSuma(5, 10);
        //*****
        //Esta es otra manera
        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(op, 10, 10);
    }
    public void miMetodo(Operaciones op, int num1 , int num2){
        
        op.imprimeSuma(num1, num2);
    }
}

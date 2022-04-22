package sobre_carga;

public class Principal {

    public static void main(String[] args) {
        /*System.out.println("==> CalculadoraInt --> Resultado = " + Principal.engine_1().calculate(5, 5));
        System.out.println("==> CalculadoraLong --> Resultado = " + Principal.engine_2().calculate(6, 2)); */
        //Solucion Realizando sobrecargas de metodos
        System.out.println("==> CalculadoraInt --> Resultado = " + Principal.engine((int) 3, (int) 3).calculate(5, 5));
        System.out.println("==> CalculadoraLong --> Resultado = " + Principal.engine((long) 3, (long) 2).calculate(6, 2));
    }

    /*//Retorna un objeto de tipo "CalculadoraInt"
    private static CalculadoraInt engine_1() {
        return (x, y) -> x * y;
    }

    //Retorna un objeto de tipo "CalculadoraLong"
    private static CalculadoraLong engine_2() {
        return (x, y) -> x - y;
    }*/
    //Solucion
    private static CalculadoraInt engine(int a, int b) {
        return (x, y) -> a * b;
    }

    //Retorna un objeto de tipo "CalculadoraLong"
    private static CalculadoraLong engine(long a, long b) {
        return (x, y) -> a - b;
    }
}

package lambda;

public class Principal {

    public static void main(String[] args) {

        Principal.engine((x, y) -> x + y);
        Principal.engine((x, y) -> x - y);
        Principal.engine((x, y) -> x * y);
        Principal.engine((x, y) -> x / y);
        Principal.engine((x, y) -> x % y);
        //
        Principal.enginee((x, y) -> x + y);
        Principal.enginee((x, y) -> x - y);
        Principal.enginee((x, y) -> x * y);
        Principal.enginee((x, y) -> x / y);
        Principal.enginee((x, y) -> x % y);

    }

//Sobrecarga de Metodos
    private static void engine(CalculadoraInt cal) {

        int x = 2;
        int y = 4;

        int resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);

    }

    private static void enginee(CalculadoraLong cal) {

        int x = 2;
        int y = 4;

        double resultado = cal.calcular(x, y);
        System.out.println();
        System.out.print("Resultado = " + resultado);
    }
}

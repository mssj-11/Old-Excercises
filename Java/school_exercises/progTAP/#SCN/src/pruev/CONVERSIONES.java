package pruev;

public class CONVERSIONES {

    public String D_Binario(int decimal) {
        String cadena = "";
        int residuo, aux;
        aux = decimal;
        while (decimal > 0) {
            residuo = (decimal % 2);
            cadena = residuo + cadena;
            decimal = decimal / 2;

        }

        return cadena;
    }

    public String D_Octal(int decimal) {
        String octal = "";
        char digitosO[] = {'0', '1', '2', '3', '4', '5', '6', '7'};

        int resto, aux = decimal;

        while (aux > 0) {
            resto = aux % 8;
            octal = digitosO[resto] + octal;
            aux /= 8;
        }
        return octal;
    }

    public String D_Hexadecimal(int decimal) {
        String hexadecimal = "";
        char digitosO[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int resto, aux = decimal;

        while (aux > 0) {
            resto = aux % 16;
            hexadecimal = digitosO[resto] + hexadecimal;
            aux /= 16;
        }
        return hexadecimal;
    }

    public int Bn_B10(String er, int base) {

        int resul = 0;
        StringBuilder reversa = new StringBuilder(er).reverse();

        for (int i = 0; i < reversa.length(); i++) {
            switch (reversa.charAt(i)) {
                case 'A':
                case 'a':
                    resul += 10 * potencia(base, i);
                    break;
                case 'B':
                case 'b':
                    resul += 11 * potencia(base, i);
                    break;
                case 'C':
                case 'c':
                    resul += 12 * potencia(base, i);
                    break;
                case 'D':
                case 'd':
                    resul += 13 * potencia(base, i);
                    break;
                case 'E':
                case 'e':
                    resul += 14 * potencia(base, i);
                    break;
                case 'F':
                case 'f':
                    resul += 15 * potencia(base, i);
                    break;
                default:
                    resul += (Integer.parseInt("" + reversa.charAt(i))) * potencia(base, i);
                    break;
            }

        }
        return resul;
    }

    public int potencia(int a, int b) {
        int potencia = 1;
        for (int i = 1; i <= b; i++) {
            potencia = potencia * a;
        }
        return potencia;
    }
}

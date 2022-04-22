/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPERACIONES;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Operaciones {

    public void Suma() {
        String num1, num2;
        boolean b = true;
        double n = 0, n2 = 0, resultado = 0;
        while (b) {
            try {
                Scanner ent = new Scanner(System.in);
                System.err.println("INTRODUCE EL 1er VALOR:");
                num1 = ent.next();
                System.err.println("INTRODUCE EL 2do VALOR:");
                num2 = ent.next();
                n = Double.parseDouble(num1);
                n2 = Double.parseDouble(num2);
                resultado = n + n2;
                if (n != 0 && n2 != 0) {
                    b = false;
                }
            } catch (Exception e) {
                System.err.println("INTRODUCE UN NUMERO & NO UN CARACTER   --" + e + "--");
            } finally {
                System.err.println("EL RESULTADO DE LA SUMA ES:");
                System.err.println(+resultado);

            }
        }
    }
// ------------------------------------------------------------------------------------------- 

    public void Resta() {
        String num1, num2;
        boolean b = true;
        double n = 0, n2 = 0, resultado = 0;
        while (b) {
            try {
                Scanner ent = new Scanner(System.in);
                System.err.println("INTRODUCE EL 1er VALOR:");
                num1 = ent.next();
                System.err.println("INTRODUCE EL 2do VALOR:");
                num2 = ent.next();
                n = Double.parseDouble(num1);
                n2 = Double.parseDouble(num2);
                resultado = n - n2;
                if (n != 0 && n2 != 0) {
                    b = false;
                }
            } catch (Exception e) {
                System.err.println("INTRODUCE UN NUMERO & NO UN CARACTER   --" + e + "--");
            } finally {
                System.err.println("EL RESULTADO DE LA RESTA ES:");
                System.err.println(+resultado);

            }
        }
    }
// -------------------------------------------------------------------------------------------

    public void Multiplicacion() {
        String num1, num2;
        boolean b = true;
        double n = 0, n2 = 0, resultado = 0;
        while (b) {
            try {
                Scanner ent = new Scanner(System.in);
                System.err.println("INTRODUCE EL 1er VALOR:");
                num1 = ent.next();
                System.err.println("INTRODUCE EL 2do VALOR:");
                num2 = ent.next();
                n = Double.parseDouble(num1);
                n2 = Double.parseDouble(num2);
                resultado = n * n2;
                if (n != 0 && n2 != 0) {
                    b = false;
                }
            } catch (Exception e) {
                System.err.println("INTRODUCE UN NUMERO & NO UN CARACTER   --" + e + "--");
            } finally {
                System.err.println("EL RESULTADO DE LA MULTIPLICACION ES:");
                System.err.println(+resultado);

            }
        }
    }
// -----------------------------------------------------------------------------------------------

    public void Division() {
        String num1, num2;
        boolean b = true;
        double n = 0, n2 = 0, resultado = 0;
        while (b) {
            try {
                Scanner ent = new Scanner(System.in);
                System.err.println("INTRODUCE EL 1er VALOR:");
                num1 = ent.next();
                System.err.println("INTRODUCE EL 2do VALOR:");
                num2 = ent.next();
                n = Double.parseDouble(num1);
                n2 = Double.parseDouble(num2);

                if (n2 == 0) {
                    System.err.println("Introduce un numero diferente a cero  --java.lang.ArithmeticException--");
                }
                resultado = n / n2;
                if (n != 0 && n2 != 0) {
                    b = false;
                }

            } catch (java.util.InputMismatchException e) {

                System.err.println("INTRODUCE UN NUMERO & NO UN CARACTER  --" + e + "--");
            } catch (java.lang.ArithmeticException e) {
                System.err.println("Introduce un numero diferente a cero   --" + e + "--");
            } finally {
                System.err.println("EL RESULTADO DE LA DIVISION ES:");

                System.err.println(+resultado);

            }
        }
    }

    void Suma(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Resta(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Multiplicacion(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Division(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

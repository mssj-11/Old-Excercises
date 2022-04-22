/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Hexagono extends Poligono {
    public double lados;
    public double Area;
    public double Perimetro;

    public Hexagono(double lados) {
        super(6);
        this.lados = lados;
    }
    public Hexagono() {
        super(6);
        this.lados = 12;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
@Override
    public double Area(){
     double i, j, k;
     i = Math.pow(lados,2);
     j = Math.pow((lados / 2), 2);
     k = Math.sqrt(i-j);
     Area = ((lados * 6)*(k))/2;
     System.out.println("LADOS -->"+lados);
     System.out.println("APOTEMA -->"+k);
     System.out.println("EL AREA DEL HEXAGONO ES --> "+Area);
     return 0;
    }
    @Override
    public double Perimetro(){
    Perimetro = (lados * 6);
    System.out.println("EL PERIMETRO DEL HEXAGONO ES --> "+Perimetro);
    return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void EntradaH (){
    Scanner EH = new Scanner (System.in);
    System.out.println("DA EL VALOR DE LOS LADOS -->");
    lados = EH.nextDouble();
    }
    
    
    
}

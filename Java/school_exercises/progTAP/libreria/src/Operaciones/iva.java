/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author HP
 */
public class iva {

    public double Ivamex(double precio) {
        precio = precio * .16;
        return precio;
    }

    public double Ier(double sueldo) {
        double imp;
        if(sueldo>=0.01 && sueldo <=496.06){
            imp = sueldo * .019;
            sueldo = imp;
        }
        else if (sueldo >= 496.07 && sueldo <= 4210.41) {

            /* double limite_inferior = 0.01;
          double descuento = 0.192;
          double cuota = 0;
           double se = sueldo-limite_inferior;
          double si=se*descuento;
          double su=si+cuota;
          sueldo =su;*/
            imp = sueldo * .0640;
            sueldo = imp;

        } else if (sueldo >= 4210.42 && sueldo <= 7399.42) {
            imp = sueldo * .1088;
            sueldo = imp;
            /*double limite_inferior = 496.08;
          double descuento = 0.064;
          double cuota = 9.52;
         
          double ter = sueldo-limite_inferior;
          double tir=ter*descuento;
          double tur=tir+cuota;
          sueldo =tur;*/
        } else if (sueldo >= 7399.43 && sueldo <= 8601.50) {

            imp = sueldo * 0.16;
            sueldo = imp;
            /*double limite_inferior = 4210.42;
          double descuento = 0.1088;
          double cuota = 247.25;
             double a = sueldo-limite_inferior;
          double b=a*descuento;
          double c=b+cuota;
          sueldo =c;*/

        } else if (sueldo >= 8601.51 && sueldo <= 10298.35) {
            imp = sueldo * .1792;
            sueldo = imp;
            /*  double limite_inferior = 7399.43;
          double descuento = 0.16;
          double cuota = 594.21;
           double va = sueldo-limite_inferior;
          double ve=va*descuento;
          double vi=ve+cuota;
          sueldo =vi;*/

        } else if (sueldo >= 10298.36 && sueldo <= 20770.29) {
            imp = sueldo * .2136;
            sueldo = imp;
            /*double inferior = 8601.51;
          double des = 0.1792;
          double cuot = 786.54 ;
           double i = sueldo-inferior;
          double v=i*des;
          double n=v+cuot;
          sueldo =n;*/

        } else if (sueldo >= 20770.30 && sueldo <= 32736.83) {
            imp = sueldo * 0.2352;
            sueldo = imp;
            /*double limite_inferior = 10298.36;
          double descuento = 0.2136;
          double cuota = 1090.61;
           double ja = sueldo-limite_inferior;
          double je=ja*descuento;
          double ji=je+cuota;
          sueldo =ji;*/

        } else if (sueldo >= 32736.84 && sueldo <= 62500.00) {
            imp = sueldo * 0.3;
            sueldo = imp;
            /*
          double limite_inferior =20770.29;
          double descuento =;
          double cuota = 3327.42;
            double na = sueldo-limite_inferior;
          double ne=na*descuento;
          double ni=ne+cuota;
          sueldo =ni*/

        } else if (sueldo >= 62500.00 && sueldo <= 83333.33) {
            imp = sueldo * 0.32;
            sueldo = imp;
            /*  double limite_inferior = 32736.84;
          double descuento = 0.3;
          double cuota = 6141.95;
          double k = sueldo-limite_inferior;
          double l=k*descuento;
          double m=l+cuota;
          sueldo =m;*/

        } else if (sueldo >= 83333.34 && sueldo <= 250000.00) {
            /* imp=sueldo* 0.34;
           sueldo=imp; 22499.99   7199.9968*/

            double limite_inferior = 62500.01;
            double descuento = 0.32;
            double cuota = 15070.90;
            double dd = sueldo - limite_inferior;
            double bb = dd * descuento;
            double jj = bb + cuota;
            sueldo = jj;

        }

        return sueldo;
    }

}

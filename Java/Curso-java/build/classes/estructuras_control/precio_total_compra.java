/*
    Preguntar el precio de un producto y el numero de unidades a comprar.
    1. Calcular el precio FINAL
    2. Aplicando los sig. descuentos:
        Compra < 100 - No hay descuento
        Compra > 200 - Descuento del 15%
        En cualquier otro caso el descuento sera del 10%
 */
package estructuras_control;
//  #4  Precio TOTAL de una compra
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class precio_total_compra {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingresa el precio del producto a comprar: ");
        double precio = sc.nextDouble();
        
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = sc.nextInt();
        
        // Calculando el precio resultante
        double precioCompra = precio*cantidad;
        double descuento;
        
        
        if(precioCompra<100){
            descuento = 0;
            System.out.println("\nEl pecio total es de: " +precioCompra+ "\nY su descuento es del 0%\n");
        }
        else if(precioCompra>200){
            descuento = (15*precioCompra)/100;
            System.out.println("\nEl pecio total es de: " +precioCompra+ "\nY su descuento es del 15%\n");
        }
        else{
            descuento = (10*precioCompra)/100;
            System.out.println("\nEl pecio total es de: " +precioCompra+ "\nY su descuento es del 10%\n");
        }
        double precioFinal = precioCompra - descuento;
        System.out.println("Precion FINAL es de: " +precioFinal);
        
        
    }
}
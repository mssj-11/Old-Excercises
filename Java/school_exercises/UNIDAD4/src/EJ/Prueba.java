/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ;

/**
 *
 * @author HP
 */
public class Prueba {
    
    
     // No importa el tipo de Instrumento,
    // seguirá funcionando debido al Polimorfismo:
    static void afinar(Instrumento i) {
	// ...
	i.tocar();
    }

    static void afinarTodo(Instrumento[] e) {
	
        for (Instrumento e1 : e) {
            afinar(e1);
        }
    }


    public static void main(String[] args) {
        // Declarar un Arreglo SIN INSTANCIAS es valido en Clases Abstractas
	Instrumento[] orquesta = new Instrumento[5];
        // Generar una INSTANCIA de una la Clase Abstracta no es valido 
        // Instrumento nuevo = new Instrumento();
	int i = 0;
	// Up-casting al asignarse el Arreglo
	orquesta[i++] = new Guitarra();
	orquesta[i++] = new Piano();
	orquesta[i++] = new Saxofon();
	orquesta[i++] = new Gibson();
	orquesta[i++] = new Ukelele();
	afinarTodo(orquesta);
    }
    
}

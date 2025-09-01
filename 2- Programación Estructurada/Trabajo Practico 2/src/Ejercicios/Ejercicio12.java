package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio12 { // Modificación de un array de precios y visualización de resultados. 

    public static void main(String[] args) {
        // Declarar e inicializar un array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar valores originales Blucle for-each
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // Modificar el precio de un producto específico (tercer elemento, índice 2)
        precios[2] = 129.99;

        // Mostrar valores modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}

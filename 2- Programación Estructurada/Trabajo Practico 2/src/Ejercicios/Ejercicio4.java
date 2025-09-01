package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio4 { //Calculadora de Descuento

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Double precio;
        char categoria;
        String descuento = "";
        System.out.println("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        System.out.println("Ingrese la categoría A,B o C: ");
        categoria = input.next().charAt(0);

        if (categoria == 'a' || categoria == 'A') {
            precio = precio - (precio * 0.10);
            descuento = "10%";
        } else if (categoria == 'b' || categoria == 'B') {
            precio = precio - (precio * 0.15);
            descuento = "15%";
        } else if (categoria == 'c' || categoria == 'C') {
            precio = precio - (precio * 0.20);
            descuento = "20%";
        }

        System.out.println("Descuento aplicado " + descuento);
        System.out.println("Precio final: " + precio);
    }
}

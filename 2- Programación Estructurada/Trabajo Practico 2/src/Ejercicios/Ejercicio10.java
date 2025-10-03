package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 { // Actualización de stock a partir de venta y recepción de productos.

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return (stockActual - cantidadVendida) + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de stock: ");
        int stockActual = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El Nuevo Stock es : " + nuevoStock);

    }
}

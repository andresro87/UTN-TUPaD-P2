package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio9 {

    //Funciones o Métodos
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10 * peso;
        } else {
            System.out.println("Zona inválida.");
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;

    }

    /////////////////////////////////////   
       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables 
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el peso del producto en Kg: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese la zona (Nacional o Internacional): ");
        String zona = input.nextLine();

        // Llamar a las funciones 
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("EL Total es: " + totalCompra);
    }
}

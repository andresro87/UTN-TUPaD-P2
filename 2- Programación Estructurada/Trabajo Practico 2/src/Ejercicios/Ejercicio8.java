package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio8 {

    private static double precioBase; //variable de clase 
// se usa private en vez de public para que no pueda ser usada por otra clase 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;

        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
}

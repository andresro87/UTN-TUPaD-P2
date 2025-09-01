package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio11 {

    static double porcentajeDescuento = 0.10; //Variable global

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * porcentajeDescuento;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio: ");
        double precio = Double.parseDouble(input.nextLine());

//llamado al metodo o funcion
        calcularDescuentoEspecial(precio);

    }
}

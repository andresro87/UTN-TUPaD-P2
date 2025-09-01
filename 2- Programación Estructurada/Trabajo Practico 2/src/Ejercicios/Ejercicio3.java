package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio3 { //Edad

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese la Edad: ");
        edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad > 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto Mayor");
        }
    }
}

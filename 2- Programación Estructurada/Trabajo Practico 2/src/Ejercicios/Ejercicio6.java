package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio6 { // Contador de Positivos, Negativos y Ceros

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un número: ");
            num = input.nextInt();

            if (num < 0) {
                negativos++;
            } else if (num == 0) {
                ceros++;
            } else {
                positivos++;
            }
            System.out.println("Números positivos: " + positivos);
            System.out.println("Números negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }
    }
}

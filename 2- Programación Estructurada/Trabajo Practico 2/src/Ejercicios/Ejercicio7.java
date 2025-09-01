package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio7 { //Validacion de Nota

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }
}

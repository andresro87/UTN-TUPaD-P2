package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio5 { //Números Pares

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumatoria = 0;
        int num;
        System.out.println("Ingrese un número entero ó 0 para cortar: ");
        num = input.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                sumatoria += num;
            }
            System.out.println("Ingrese un número entero ó 0 para cortar: ");
            num = input.nextInt();
        }
        System.out.println("La suma total de los números pares ingresados es: " + sumatoria);
    }
}

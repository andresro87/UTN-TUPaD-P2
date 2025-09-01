package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio2 { //Mayor de 3 números

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor;
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = input.nextInt();

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        } else {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}

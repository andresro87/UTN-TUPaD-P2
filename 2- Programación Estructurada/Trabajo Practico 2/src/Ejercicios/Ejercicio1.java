package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 { //Año bisiesto

    public static void main(String[] args) {
        int anio;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el año que desea consultar: ");
        anio = input.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}

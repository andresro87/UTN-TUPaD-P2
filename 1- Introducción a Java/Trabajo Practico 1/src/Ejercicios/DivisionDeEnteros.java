package Ejercicios;

import java.util.Scanner;

public class DivisionDeEnteros {

    public static void main(String[] args) {

        double num1, resultado, num2;
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("Ingrese el primer número: ");
        num1 = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Double.parseDouble(input.nextLine());
        
        resultado = num1 / num2;
        System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es " + resultado);
    }
}

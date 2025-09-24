
package Ejercicios;

import java.util.Scanner;


public class Operaciones {
public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    int num1, num2, suma, resta;
    double producto, division;
    System.out.print("Ingrese el primer número: ");
    num1 = Integer.parseInt(input.nextLine());
    System.out.print("Ingrese el segundo número: ");
    num2 = Integer.parseInt(input.nextLine());
    suma = num1 + num2;
    resta= num1 - num2;
    producto= num1 * num2;
    division = (double) num1 / num2;
    
    System.out.println("La suma entre " + num1 + " y " + num2 + " es: "+ suma);
    System.out.println("La resta entre " + num1 + " y " + num2 + " es: "+ resta);
    System.out.println("El producto entre " + num1 + " y " + num2 + " es: "+ producto);
    System.out.println("La división entre " + num1 + " y " + num2 + " es: "+ division);
}

}
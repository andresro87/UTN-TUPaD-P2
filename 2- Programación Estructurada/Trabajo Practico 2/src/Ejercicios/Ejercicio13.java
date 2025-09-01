package Ejercicios;

/**
 *
 * @author andre
 */
public class Ejercicio13 { //Impresión recursiva de arrays antes y después de modificar un elemento. 

    // Función recursiva para mostrar precios
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice == precios.length) {
            return; // Caso base: ya no hay más elementos
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPrecios(precios, indice + 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con los precios de algunos productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Usar función recursiva para mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        // c. Modificar el precio de un producto específico (tercer elemento → índice 2)
        precios[2] = 129.99;

        // d. Usar otra función recursiva para mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios, 0);
    }
}

package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 7);
        figuras[2] = new Circulo(2);

        for (Figura f : figuras) {
            f.mostrarArea(); // POLIMORFISMO
        }
    }
}

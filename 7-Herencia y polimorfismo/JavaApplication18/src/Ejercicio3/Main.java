package Ejercicio3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> lista = new ArrayList<>();

        lista.add(new EmpleadoPlanta("Luis", 150000));
        lista.add(new EmpleadoTemporal("Ana", 80, 1500));
        lista.add(new EmpleadoPlanta("María", 170000));

        for (Empleado e : lista) {
            System.out.println("----");
            System.out.println("Empleado: " + e.nombre);
            System.out.println("Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}

package Ejercicio2;

public class MainMascotas {

    public static void main(String[] args) {

        Mascota mascota1 = new Mascota();
        mascota1.setEdad(2);
        mascota1.setNombre("Loki");
        mascota1.setEspecie("Perro");

        // Mostrar su información
        System.out.println("Información inicial:");
        mascota1.mostrarInfo();

        //  Simular el paso del tiempo
        System.out.println("\nLa mascota cumple 3 años más...");
        mascota1.cumplirAnios(3);

        //  Verificar los cambios
        System.out.println("\nInformación después de cumplir años:");
        mascota1.mostrarInfo();
    }
}

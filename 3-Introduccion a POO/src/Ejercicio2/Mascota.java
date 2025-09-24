package Ejercicio2;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre de la mascota: " + nombre);
        System.out.println("Especie de la mascota: " + especie);
        System.out.println("Edad de la mascota: " + edad);

    }

    public int cumplirAnios(int anios) {
        if (anios > 0) {
            edad += anios;
        } else {
            System.out.println("Ingrese un numero positivo");
        }
        return edad;
        
        
            
                
                
    }
}

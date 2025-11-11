package Ejercicio4;

public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    //Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
    public void mostrarEstado() {
        System.out.println("Id Gallina: " + idGallina);
        System.out.println("Edad de la gallina: " + edad);
        System.out.println("Cantidad de huevos puestos: " + huevosPuestos);

    }

    public int ponerHuevo(int huevo) {
        if (huevo > 0) {
            huevosPuestos = huevosPuestos + huevo;
        }
        return huevosPuestos;
    }
    public int envejecer(int anios) {
        if (anios > 0) {
            edad += anios;
        } else {
            System.out.println("Ingrese un numero positivo");
        }
        return edad;
}
}
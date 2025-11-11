package Ejercicio1.pkg3;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    //Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos)
    public void mostrarInfo() {
        System.out.println("Estudiante: " + apellido + " " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
            System.out.println("Calificación: " + calificacion);
        } else {
            System.out.println("La calificación no puede superar los 10 puntos");
        }

    }

    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
            System.out.println("Calificación: " + calificacion);
        } else {
            System.out.println("La calificación no puede ser negativa");
        }
    }
}

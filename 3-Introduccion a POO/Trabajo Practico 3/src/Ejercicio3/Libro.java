package Ejercicio3;

import java.time.Year;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int añoActual = Year.now().getValue();
        if (anioPublicacion >= 1900 && anioPublicacion < añoActual) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicacion actualizado");
        } else {
            System.out.println("El año ingresado no es correcto");
        }
    }

    public void mostrarInfo() {
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}

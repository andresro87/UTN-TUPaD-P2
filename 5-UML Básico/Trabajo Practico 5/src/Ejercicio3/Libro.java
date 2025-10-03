package Ejercicio3;

public class Libro {

    private String nombre;
    private String isbd;
    private Autor autor; //asociacion unidireccional
    private Editorial editorial; //agregacion

    public Libro(String nombre, String isbd, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.isbd = isbd;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbd() {
        return isbd;
    }

    public void setIsbd(String isbd) {
        this.isbd = isbd;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", isbd=" + isbd + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}

package Ejercicio3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Asignar o cambiar profesor, sincronizando ambos lados
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return; // no hay cambio
        }

        // Quitar el curso del profesor anterior si había uno
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        // Asignar nuevo profesor y agregar este curso a su lista
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso: " + codigo + " | " + nombre + " | Profesor: " + prof);
    }

    @Override
    public String toString() {
        String prof = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        return codigo + " - " + nombre + " (" + prof + ")";
    }
}

package Ejercicio2;

public class MainBiblioteca {

    public static void main(String[] args) {

        //Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear al menos 3 autores
        Autor autor1 = new Autor("A1", "Julio Cortázar", "Argentina");
        Autor autor2 = new Autor("A2", "Gabriel García Márquez", "Colombia");
        Autor autor3 = new Autor("A3", "George Orwell", "Reino Unido");

        // Agregar 5 libtos asociados a los autores
        biblioteca.agregarLibro("L1", "Rayuela", 1963, autor1);
        biblioteca.agregarLibro("L2", "Cien años de soledad", 1967, autor2);
        biblioteca.agregarLibro("L3", "1984", 1949, autor3);
        biblioteca.agregarLibro("L4", "Bestiario", 1951, autor1);
        biblioteca.agregarLibro("L5", "Rebelión en la granja", 1945, autor3);

        //Listar todos los libros
        biblioteca.listarLibros();

        //Buscar un libro por su ISBN
        System.out.println("--- BUSCAR LIBRO L3 ---");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("L3");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }

        // Filtrar y mostrar libros por años especifico
        int anioBuscado = 1949;
        System.out.println("--- LIBROS DEL AÑO " + anioBuscado + " ---");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(anioBuscado)) {
            l.mostrarInfo();
        }

        // Eliminar libro por su ISBN
        System.out.println("--- ELIMINAR LIBRO L2 ---");
        boolean eliminado = biblioteca.eliminarLibro("L2");
        System.out.println(eliminado ? "Libro eliminado correctamente." : "No se encontró el libro.");
        biblioteca.listarLibros();

        // Mostrar la cantidad total de libros
        System.out.println("--- CANTIDAD TOTAL DE LIBROS ---");
        System.out.println(biblioteca.obtenerCantidadLibros());

        // Listar todos los autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}

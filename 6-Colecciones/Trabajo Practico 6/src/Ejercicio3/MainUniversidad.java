package Ejercicio3;

public class MainUniversidad {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Nacional");

        // Crear profesores y cursos
        Profesor prof1 = new Profesor("P1", "Laura González", "Matemática");
        Profesor prof2 = new Profesor("P2", "Carlos Pérez", "Programación");
        Profesor prof3 = new Profesor("P3", "Mariana Díaz", "Bases de Datos");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Programación I");
        Curso c3 = new Curso("C3", "Programación II");
        Curso c4 = new Curso("C4", "Base de Datos I");
        Curso c5 = new Curso("C5", "Estadística");

        // Agregar a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C5", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");

        // Listra profesores y cursos
        uni.listarCursos();
        uni.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("--- CAMBIAR PROFESOR DEL CURSO C3 (ahora lo dicta P3) ---");
        uni.asignarProfesorACurso("C3", "P3");
        uni.listarProfesores();

        // Eliminar un curso y verificar sincronizacion
        System.out.println("--- ELIMINAR CURSO C2 ---");
        uni.eliminarCurso("C2");
        uni.listarProfesores();

        // Eliminar un profesor y verificar sus cursos quedan sin profesor 
        System.out.println("--- ELIMINAR PROFESOR P3 ---");
        uni.eliminarProfesor("P3");
        uni.listarCursos();
        uni.listarProfesores();

        // reporte final
        uni.reporteCursosPorProfesor();
    }
}

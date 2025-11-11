
package Ejercicio1.pkg3;


public class MainEstudiante {

   
    public static void main(String[] args) {
        
       Estudiante estudiante1= new Estudiante();
       estudiante1.setApellido("Rodriguez");
       estudiante1.setNombre("Andrés");
       estudiante1.setCalificacion(9);
       estudiante1.setCurso("Programación");
       
       estudiante1.mostrarInfo();
       estudiante1.bajarCalificacion(5);
       estudiante1.subirCalificacion(9);
       
    }
    
}

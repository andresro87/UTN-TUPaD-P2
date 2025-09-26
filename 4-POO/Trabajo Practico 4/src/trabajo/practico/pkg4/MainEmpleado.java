
package trabajo.practico.pkg4;


public class MainEmpleado {

   
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Peter Parker", "Fotografo");
        Empleado empleado2 = new Empleado(245, "Tony Stark", "Ingeniero", 10000);
        
        empleado1.actualizarSalario(10000);
        empleado2.actualizarSalario(0.10);
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        Empleado.mostrarTotalEmpleados();
    }
    
}

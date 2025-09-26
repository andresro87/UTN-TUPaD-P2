package trabajo.practico.pkg4;

public class Empleado {

    private int id; // Identificador único del empleado. 
    private String nombre; //Nombre completo. 
    private String puesto; //Cargo que desempeña. 
    private double salario; //Salario actual. 
    private static int totalEmpleados = 0;  //Contador global de empleados creados. Variable de clase

//Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
//Contructor 

    public Empleado(String nombre, String puesto) {
        this.puesto = puesto;
        this.nombre = nombre;
        this.salario = 1000;
        this.id = totalEmpleados + 1;
        totalEmpleados++;
    }

//Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }
//Método toString

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    //Método Actualizar salario
    public double actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
        }
        return salario;
    }

//Método Actualizar salario sobrecargado
    public double actualizarSalario(int montoFijo) {
        if (montoFijo > 0);
        salario += montoFijo;

        return salario;
    }
//Metodo mostrar total de empleados
    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados: " + totalEmpleados);
    }

}

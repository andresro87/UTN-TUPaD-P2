package Ejercicio5;

public class Nave {

    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100; //para evitar superar el limite de recarga

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    //Métodos requeridos: despegar(), avanzar(distancia), 
    //recargarCombustible(cantidad), mostrarEstado()
    public void mostrarEstado() {
        System.out.println("Nombre de la Nave: " + nombre);
        System.out.println("Nivel de combustible: " + combustible);
    }

    public void despegar() {
        if (combustible >= 10) {
            System.out.println("La nave ha despegado");
            combustible -= 10;
        } else {
            System.out.println("El combustible no es suficiente para despegar");
        }
    }
      public void avanzar(int distancia){
          if (combustible >= distancia) {
            System.out.println("La nave ha avanzado");
            combustible -= distancia;
        } else {
            System.out.println("El combustible no es suficiente para avanzar");
        }
    }
      public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("El tanque se ha llenado al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se han recargado " + cantidad + " unidades de combustible.");
        }
    }
      
        
    }

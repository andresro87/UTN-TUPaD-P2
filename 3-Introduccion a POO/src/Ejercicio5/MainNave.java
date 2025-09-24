package Ejercicio5;

public class MainNave {

    public static void main(String[] args) {

        Nave nave1 = new Nave();
        nave1.setNombre("Halcon Milenario");
        nave1.setCombustible(50);
        nave1.mostrarEstado();
//Avanzar con la nave
        nave1.avanzar(80);
//recargar combustible
        nave1.recargarCombustible(50);
//avanzar nuevamente
        nave1.avanzar(80);
        nave1.mostrarEstado();
    }
}

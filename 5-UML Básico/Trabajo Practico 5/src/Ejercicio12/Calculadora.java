package Ejercicio12;

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // IVA 21%
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre()
                + " - Total con IVA: " + total);
    }
}

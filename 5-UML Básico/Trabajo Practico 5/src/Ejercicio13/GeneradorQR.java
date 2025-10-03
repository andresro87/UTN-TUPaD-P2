package Ejercicio13;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); //se crea dentro del método
        System.out.println("QR generado: " + qr);
    }
}

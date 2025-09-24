
package Ejercicio4;


public class MainGranja {
    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(15785);
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(0);

        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(32562);
        gallina2.setEdad(1);
        gallina2.setHuevosPuestos(0);
        
        System.out.println("La gallina 1 envejece 1 año y pone 3 huevos.");
        gallina1.envejecer(1);
        gallina1.ponerHuevo(3);

        System.out.println("La gallina 2 envejece 2 años y pone 5 huevos.");
        gallina2.envejecer(2);
        gallina2.ponerHuevo(5);
}
}
package Ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); //Dependencia de creación
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "' en formato " + formato);
        System.out.println("Render creado: " + render);
    }
}

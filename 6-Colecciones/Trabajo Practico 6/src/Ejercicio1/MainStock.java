package Ejercicio1;

public class MainStock {

    public static void main(String[] args) {
        Inventario inv = new Inventario();

        //Crear y agregar 5 productos
        inv.agregarProducto(new Producto("P01", "Arroz", 550.0, 20, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02", "Notebook", 450000.0, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P03", "Remera", 2500.0, 15, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P04", "Licuadora", 7000.0, 7, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P05", "Fideo", 350.0, 30, CategoriaProducto.ALIMENTOS));

        // Listar todos los productos
        System.out.println("--- LISTA DE PRODUCTOS ---");
        inv.listarProductos();

        // Buscar por ID
        System.out.println("--- BUSCAR PRODUCTO P03 ---");
        Producto encontrado = inv.buscarProductoPorId("P03");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el producto con ese ID.");
        }

        //Filtrar por categoría
        System.out.println("--- FILTRAR ALIMENTOS ---");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        //Eliminar un productos (P02)
        System.out.println("--- ELIMINAR P02 ---");
        inv.eliminarProducto("P02");
        inv.listarProductos();

        //Actualizar Stock de P01
        System.out.println("--- ACTUALIZAR STOCK P01 A 50 ---");
        inv.actualizarStock("P01", 50);
        inv.buscarProductoPorId("P01").mostrarInfo();

        //Mostrar total de Stock
        System.out.println("--- TOTAL DE STOCK ---");
        System.out.println(inv.obtenerTotalStock());

        //Mostrar Producto con mayor Stock
        System.out.println("--- PRODUCTO CON MAYOR STOCK ---");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        }

        //Filtrar productos por rango de precio de 1000 a 3000
        System.out.println("--- PRODUCTOS ENTRE $1000 Y $3000 ---");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        //Mostrar categorias disponibles
        System.out.println("--- CATEGORÍAS DISPONIBLES ---");
        inv.mostrarCategoriasDisponibles();
    }
}

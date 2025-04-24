package EjerciciosRepasos;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto manzana = new Producto("Manzana", 0.5, 10);
        Producto pan = new Producto("Pan", 1.0, 5);

        // Crear supermercado y agregar productos al inventario
        Supermercado supermercado = new Supermercado();
        supermercado.agregarProducto(manzana);
        supermercado.agregarProducto(pan);

        // Crear cliente
        Cliente cliente = new Cliente("Juan", "Pérez");

        // Cliente agrega productos al carrito
        cliente.agregarCarritoProducto(new Producto("Manzana", 0.5, 1));
        cliente.agregarCarritoProducto(new Producto("Pan", 1.0, 1));

        // Mostrar inventario antes de la compra
        System.out.println("Inventario antes de la compra:");
        supermercado.mostrarInventario();

        // Cliente realiza la compra
        System.out.println("\nRealizando la compra...");
        supermercado.realizarCompra(cliente);

        // Mostrar inventario después de la compra
        System.out.println("\nInventario después de la compra:");
        supermercado.mostrarInventario();
    }
}
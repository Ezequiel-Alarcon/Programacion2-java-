package EjerciciosRepasos;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Producto> inventario;

    public Supermercado() {
        this.inventario = new ArrayList<>();
    }


    public void agregarProducto(Producto producto) {
        this.inventario.add(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }


    public void realizarCompra(Cliente cliente) {
        // Calcular el total de la compra antes de vaciar el carrito
        double totalCompra = cliente.totalCarrito();
        System.out.println("El total de la compra es: $" + totalCompra);

        // Recorremos los productos en el carrito del cliente
        for (Producto productoCarrito : cliente.getCarritoProductos()) {
            // Buscar el producto en el inventario del supermercado
            Producto productoInventario = buscarProducto(productoCarrito.getNombre());

            // Verificar si el producto existe en el inventario y si hay stock suficiente
            if (productoInventario != null && productoInventario.getCantidadStock() >= 1) {
                // Reducir la cantidad en el inventario
                productoInventario.setCantidadStock(productoInventario.getCantidadStock() - 1);
            } else {
                // Mostrar mensaje si el producto no está disponible o no hay stock
                System.out.println("Producto " + productoCarrito.getNombre() + " no disponible en stock.");
            }
        }

        // Vaciar el carrito del cliente después de procesar la compra
        cliente.getCarritoProductos().clear();
    }

    public void mostrarInventario() {
        inventario.forEach(System.out::println);
    }
}
package EjerciciosRepasos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private List<Producto> carritoProductos;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carritoProductos = new ArrayList<>(); // Inicializa el carrito vacío
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Producto> getCarritoProductos() {
        return carritoProductos;
    }

    public void agregarCarritoProducto(Producto producto) {
        this.carritoProductos.add(producto);
    }

    public double totalCarrito() {
        double total = 0.0;
        for (Producto producto : carritoProductos) {
            total += producto.getPrecio();
        }
        return total;
    }
}

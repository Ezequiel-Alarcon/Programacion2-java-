package Practico_8;

import java.util.List;

public class Carrito<T extends Producto<?>> {
    private List<T> productos;

    public Carrito(List<T> productos) {
        this.productos = productos;
    }

    public void agregarProducto(T producto){
        this.productos.add(producto);
    }

    public void eliminarProducto(T producto){
        this.productos.remove(producto);
    }

    public double obtenerTotal(){
        double total = 0.0;
        for (T producto : productos){
        total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos(){
        for (T producto : productos){
            System.out.println(producto);
        }
    }
}

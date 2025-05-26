package Practico_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido>,Identificable<Integer>{

    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto<?> productos){
        this.productos.add(productos);
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Producto<?> producto : productos){
            total += producto.getPrecio();
        }
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Pedido o) {
        return Double.compare(this.calcularTotal(), o.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", productos=" + productos +
                ", fecha=" + fecha +
                '}';
    }

    public List<Producto<?>> getProductos() {
        return productos;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }
}

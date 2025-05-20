package Practico_7.Kata_1_1;

import java.util.ArrayList;


public class Pedido implements Pagable{
    private ArrayList<Producto> productos;

    public Pedido(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

}

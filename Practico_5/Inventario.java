package Practico_5;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public void listarProducto(){
        for (Producto producto :productos){
            producto.mostrarInfo();
            System.out.println("------------------------");
        }
    }

    public Producto buscarProductoPorId(String id){
        for (Producto producto :productos){
            if (producto.getId().equals(id)){
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String id ){
        int i = 0;
        while (i < productos.size()){
            if (productos.get(i).getId().equals(id)){
                productos.remove(i);
                break;
            }
            else{
                i++;
            }
        }
    }

    public void actualizarStock(String id, int nuevaCantidad){
        int i = 0;
        while (i < productos.size()){
            if (productos.get(i).getId().equals(id)){
                productos.get(i).setCantidad(nuevaCantidad);
                break;
            }
            else{
                i++;
            }
        }
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> productosFiltrados = new ArrayList<>(); // Lista para almacenar coincidencias
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                productosFiltrados.add(producto); // Agregar productos que coincidan
            }
        }
        return productosFiltrados; // Devolver la lista completa
    }

    public int obtenerTotalStock(){
        int totalStock = 0;
        for (Producto producto : productos){
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }

    public List<Producto> obtenerProductoConMayorStock(){
        List<Producto> productosConMayorStock = new ArrayList<>();
        for (Producto producto : productos){
            if (productosConMayorStock.isEmpty()){
                productosConMayorStock.add(producto);
            }
            else if (producto.getCantidad() > productosConMayorStock.get(0).getCantidad()){
                productosConMayorStock.clear();
                productosConMayorStock.add(producto);
            }
            else if (producto.getCantidad() == productosConMayorStock.get(0).getCantidad()){
                productosConMayorStock.add(producto);
            }
        }
        return productosConMayorStock;
    }

    public List<Producto> filtrarProductoPorPrecio(double min, double max){
        List<Producto> productosFiltradosPorPrecio = new ArrayList<>();
        for (Producto producto : productos){
            if (producto.getPrecio() >= min && producto.getPrecio() <= max){
                productosFiltradosPorPrecio.add(producto);
            }
        }
        return productosFiltradosPorPrecio;
    }


}

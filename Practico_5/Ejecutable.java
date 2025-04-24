package Practico_5;

import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        //Creamos los productos
        Producto producto1 = new Producto("1", "Manzana", 1, 10, CategoriaProducto.ALIMENTOS);
        Producto producto2 = new Producto("2", "Pantalones", 60, 100, CategoriaProducto.ROPA);
        Producto producto3 = new Producto("3", "Televisor", 120, 200, CategoriaProducto.ELECTRONICA);
        Producto producto4 = new Producto("4", "Sofa", 1800, 1, CategoriaProducto.HOGAR);
        Producto producto5 = new Producto("5", "Mesa", 1000, 10, CategoriaProducto.HOGAR);

        //Agregamos los productos al inventario
        Inventario inventario = new Inventario();
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);

        //Mostramos los productos
        inventario.listarProducto();

        /*
        //Buscamos un producto por su id
        System.out.println("--------------BUSCAR POR ID---------------------");
        Producto producto = inventario.buscarProductoPorId("2");
        producto.mostrarInfo();

        //Eliminamos un producto y listamos los productos
        System.out.println("-----------------DESPUES DE ELIMINAR------------------");
        inventario.eliminarProducto("4");
        inventario.listarProducto();


        //Actualizamos el stock de un producto
        System.out.println("-----------------DESPUES DE ACTUALIZAR------------------");
        inventario.actualizarStock("1", 2);
        inventario.listarProducto();


        //Filtramos los productos por su categoria
        System.out.println("-----------------FILTRAR POR CATEGORIA------------------");
        List<Producto> productosFiltrados = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        if (!productosFiltrados.isEmpty()){
            System.out.println("Se han encontrado "+ productosFiltrados.size() + " productos");
            for (Producto producto : productosFiltrados){
                producto.mostrarInfo();
            }
        }else {
            System.out.println("No se han encontrado productos de esa categoria");
        }
         */

        //Obtenemos el total de stock de todos los productos
        System.out.println("-----------------TOTAL DE STOCK------------------");
        System.out.println("El total de stock de todos los productos es: " + inventario.obtenerTotalStock());

        //Obtenemos el producto con el mayor stock
        System.out.println("-----------------PRODUCTO CON MAYOR STOCK------------------");
        List<Producto> productoMayorStock = inventario.obtenerProductoConMayorStock();
        productoMayorStock.forEach(Producto::mostrarInfo);

        //Filtramos los productos por precio
        System.out.println("-----------------FILTRAR POR PRECIO------------------");
        List<Producto> productosFiltradosPrecio = inventario.filtrarProductoPorPrecio(1000,3000);
        productosFiltradosPrecio.forEach(Producto::mostrarInfo);

        //Mostramos las categorias
        System.out.println("-----------------CATEGORIAS------------------");
        for (CategoriaProducto categoria : CategoriaProducto.values()){
            System.out.println(categoria+": " + categoria.getDescripcion());
        }
    }
}

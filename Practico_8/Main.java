package Practico_8;

import java.time.LocalDate;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Producto<?>> productos = new ArrayList<>();
//        Producto<Double> arroz = new Producto<>(1.0, "Arroz", 2.0);
//        productos.add(arroz);
//
//        productos.add( new Producto<>(1, "Pizza", 10.0));
//        productos.add(new Producto<>("0","Pasta", 15.0));
//        productos.add(new Producto<>(2.0, "Café", 1.0));
//
//        Carrito<Producto<?>> carrito = new Carrito<>(productos);
//        carrito.agregarProducto(new Producto<>(3, "Arroz", 2.0));
//        carrito.agregarProducto(new Producto<>(4, "Lentejas", 3.0));
//
//        carrito.mostrarProductos();
//        carrito.eliminarProducto(arroz);


// Crear productos
        Producto<Integer> p1 = new Producto<>(1, "Arroz", 10.0);
        Producto<String> p2 = new Producto<>("A2", "Fideos", 12.0);
        Producto<Double> p3 = new Producto<>(3.5, "Salsa", 5.0);

// Crear pedidos
        Pedido pedido1 = new Pedido(101, LocalDate.of(2024, 5, 10));
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);

        Pedido pedido2 = new Pedido(102, LocalDate.of(2024, 5, 5));
        pedido2.agregarProducto(p3);

        Pedido pedido3 = new Pedido(103, LocalDate.of(2024, 5, 15));
        pedido3.agregarProducto(p1);
        pedido3.agregarProducto(p2);
        pedido3.agregarProducto(p3);

// Crear lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

// Ordenar por total (usa compareTo de Pedido)
//        System.out.println("Ordenado por total:");
//        Collections.sort(pedidos);
//        for (Pedido p : pedidos) {
//            System.out.println(p + " TOTAL: $" + p.calcularTotal());
//        }

// Ordenar por fecha (usa Comparator)
//        System.out.println("\nOrdenado por fecha:");
//        pedidos.sort(new ComparadorPedidoPorFecha());
//        for (Pedido p : pedidos) {
//            System.out.println(p + " FECHA: " + p.getFecha());
//        }

        // Crear buscador y buscar por ID
        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido resultado = buscador.buscar(pedidos, 102);

        // Mostrar resultado
        if (resultado != null) {
            System.out.println("Pedido encontrado:");
            System.out.println(resultado);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }
}

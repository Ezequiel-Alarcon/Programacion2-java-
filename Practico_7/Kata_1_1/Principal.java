package Practico_7.Kata_1_1;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Laptop", 1000));
        pedido.agregarProducto(new Producto("Mouse", 50));
        pedido.agregarProducto(new Producto("Teclado", 80));
        System.out.println("Total a pagar: $" + pedido.calcularTotal());
    }
}

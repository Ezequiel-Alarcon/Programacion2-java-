package Practico_7.Kata_1_3;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new Cliente("juan","juan221313@gmail.com"),"proceso");

        pedido.cambiarEstado("'Enviado'");
        pedido.cambiarEstado("'Entregado'");
    }
}

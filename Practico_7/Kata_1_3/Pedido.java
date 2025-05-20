package Practico_7.Kata_1_3;

public class Pedido implements Notificable{
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente, String estado) {
        this.cliente = cliente;
        this.estado = estado;
    }

    public void cambiarEstado(String estado){
        this.estado = estado;
        cliente.notificar("Su estado ha cambiado a " + estado);
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificamos al cliente "+ cliente + "Sobre su estado " + estado);
    }
}

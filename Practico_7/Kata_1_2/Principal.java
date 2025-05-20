package Practico_7.Kata_1_2;

public class Principal {
    public static void main(String[] args) {
        PagoConDescuento tarjeta = new TarjetaCredito(123456789);
        PagoConDescuento paypal = new Paypal("Ezequielw22l@gmail.com");

        double monto = 500;
        double descuento = 10;

        tarjeta.procesarPago(monto * tarjeta.aplicarDescuento(descuento));
        paypal.procesarPago(monto * paypal.aplicarDescuento(descuento));
    }
}

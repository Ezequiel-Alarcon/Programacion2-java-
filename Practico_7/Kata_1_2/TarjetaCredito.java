package Practico_7.Kata_1_2;

public class TarjetaCredito implements PagoConDescuento{
    private int numeroTarjeta;

    public TarjetaCredito(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Tarjeta de Crédito " + numeroTarjeta);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return 1 - (porcentaje / 100);
    }

}

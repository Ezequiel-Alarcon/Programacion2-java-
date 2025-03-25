package Practico_2;

import java.util.Scanner;

/*
Crea los siguientes métodos:

1. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.

○ Nacional: $5 por kg
○ Internacional: $10 por kg

2. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.

Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego,
muestra el total a pagar.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next().toUpperCase();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        if (costoEnvio != -1) { // Verifica que la zona sea válida antes de continuar
            System.out.println("Precio de envío: $" + costoEnvio);
            double total = calcularTotalCompra(precio, costoEnvio);
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("Zona inválida. No se pudo calcular el costo de envío.");
        }
    }

    public static double calcularCostoEnvio(double peso, String zona) {

        switch (zona) {
            case "NACIONAL":
                peso = peso * 5;
                break;
            case "INTERNACIONAL":
                peso = peso * 10;
                break;
            default:
                return -1;// Devuelve -1 si la zona es inválida
        }

        return peso;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return costoEnvio + precioProducto;
    }
}

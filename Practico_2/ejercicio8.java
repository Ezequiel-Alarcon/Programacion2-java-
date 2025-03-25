package Practico_2;

import java.util.Scanner;

/*
Crea un metodo calcularPrecioFinal(double precioBase, double impuesto, double descuento)
que calcule el precio final de un producto en un e-commerce.

La fórmula es:
PrecioFinal=PrecioBase+(PrecioBase×Impuesto)−(PrecioBase×Descuento)PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)

Desde main(),
solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al metodo y muestra el precio final.
 */

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorcentaje = sc.nextDouble();
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuestoPorcentaje, descuentoPorcentaje);
        System.out.println("El precio final del producto es: "+ precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
}

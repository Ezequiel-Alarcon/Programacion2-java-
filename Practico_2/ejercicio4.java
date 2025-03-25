package Practico_2;

import java.util.Scanner;

/*
Ejercicio 4: Calculadora de Descuento
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
    ● Categoría A: 10% de descuento
    ● Categoría B: 15% de descuento
    ● Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la categoria del producto (A, B, C): ");
        String categoria = sc.next().toUpperCase();

        double descuento = 0;


        switch (categoria) {
            case "A":
                descuento = 0.1;
                break;
            case "B":
                descuento = 0.15;

                break;
            case "C":
                descuento = 0.2;
                break;
            default:
                System.out.println("Ingrese una categoria existente");
        }

        double total = (precio - (precio * descuento));

        System.out.println("El precio del producto es: " + precio);
        System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + total);
    }
}

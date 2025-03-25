package Practico_2;

import java.util.Scanner;

/*
Ejercicio 1: Verificación de Año Bisiesto
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es
bisiesto si es divisible por 4, pero no por 100, salvo que también sea divisible por 400
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un ano: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }

}

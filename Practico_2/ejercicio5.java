package Practico_2;

import java.util.Scanner;

/*
Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo
debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar
la suma total de los pares ingresados.
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int acum = 0;

        while (num != 0) {
            System.out.println("Ingrese un numero (0 para terminar)");
            num = sc.nextInt();

            if (num % 2 == 0) {
                acum += num;
            }
        }
        System.out.println("La suma de todos los numeros pares es; " + acum);
    }
}

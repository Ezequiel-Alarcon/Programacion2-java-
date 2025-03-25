package Practico_2;

import java.util.Scanner;

/*
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un
número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.
 */

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10){
                System.out.println("Error nota invalida");
            }else {
                System.out.println("Nota guardada correctamente");
            }

        } while (nota < 0 || nota > 10);
    }
}

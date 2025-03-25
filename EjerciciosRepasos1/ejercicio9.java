package EjerciciosRepasos1;
/*
    Escribe un programa que pida un número y determine si es par o impar.
*/

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("El numero ingresado es impar");
        }
    }
}

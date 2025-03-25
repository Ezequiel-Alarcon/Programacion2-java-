package EjerciciosRepasos1;
/*
    5- Crea un programa que pida un número y diga si es positivo o negativo
 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = sc.nextInt();

        if (num1 > 0){
            System.out.println("El numero ingresado es positivo");
        }
        else{
            System.out.println("El numero ingresado es negativo");
        }

    }
}

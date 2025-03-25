package EjerciciosRepasos1;
/*
    6- Crea un programa que pida dos números y determine cuál es mayor o si son iguales.
 */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("El numero "+ num1 + " es mayor");
        }
        else if (num2>num1){
            System.out.println("El numero "+ num2 + " es mayor");
        }
        else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}

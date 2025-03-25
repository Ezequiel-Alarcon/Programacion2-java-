package EjerciciosRepasos1;

import java.util.Scanner;

/*
    3- Escribe un programa que pida dos números al usuario y muestre su suma, resta,
    multiplicación, división y módulo.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("La suma de los numeros es: " + (num1 + num2) );
        System.out.println("La resta de los numero es: " + (num1 - num2) );
        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2) );
        System.out.println("La division de los numeros es: " + (num1 / num2) );
        System.out.println("La modulo de los numeros es: " + (num1 % num2) );
    }
}

package EjerciciosRepasos1;


import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Su nombre es: " + nombre + " y tiene " + edad);
    }
}

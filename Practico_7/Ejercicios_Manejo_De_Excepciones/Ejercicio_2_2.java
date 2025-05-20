package Practico_7.Ejercicios_Manejo_De_Excepciones;

import java.util.Scanner;

public class Ejercicio_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int numero;

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();

        try {
            numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
            System.out.println("Por favor, ingrese un número entero la próxima vez.");
        }
    }
}

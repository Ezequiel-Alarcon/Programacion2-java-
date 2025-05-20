package Practico_7.Ejercicios_Manejo_De_Excepciones;

import java.util.Scanner;

public class Ejercicio_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.print("Ingrese una edad: ");
        edad = sc.nextInt();

        try {
            // 2. Lanzar la excepción si la edad es inválida
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException(edad); // Lanza la excepción personalizada
            }
            System.out.println("Su edad es: " + edad);
        } catch (EdadInvalidaException e) {
            // 3. Manejar la excepción
            System.err.println("Error: " + e.getMessage()); // Imprime el mensaje de error de la excepción
        }
    }
}

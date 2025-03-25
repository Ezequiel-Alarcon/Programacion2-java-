package EjerciciosRepasos1;
/*
    7- Crea un programa que pida la edad de una persona y determine si es un niño (0-12),
    adolescente (13-17) o adulto (18 en adelante)
 */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= 12){
            System.out.println("Es un nino");
        }
        else if(edad > 12 && edad < 18){
            System.out.println("Es un adolecente");
        }
        else{
            System.out.println("es mayor de edad");
        }
    }
}

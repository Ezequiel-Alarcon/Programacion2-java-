package EjerciciosRepasos1;
/*
    10- Crea un programa que pida el salario base de un empleado y el número de horas
    extras trabajadas. Cada hora extra se paga al 50% adicional. Calcula y muestra el
    salario final
 */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su salario base");
        double salh = sc.nextDouble();
        System.out.println("Ingrese el numero de horas extras trabajadas: ");
        int horas = sc.nextInt();

        salh = salh * 1.5;
        double totalExtra = salh * horas;
        System.out.println("El salario final es: " + totalExtra);

    }
}

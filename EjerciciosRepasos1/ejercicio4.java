package EjerciciosRepasos1;
import java.util.Scanner;

/*
    4- Crea un programa que solicite dos números y determine si ambos son positivos y
    mayores que 10
 */
public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0){
            if (num1 > 10 && num2 > 10){
                System.out.println("Ambos son positivos y mayores de 10");
            }
        }
    }
}

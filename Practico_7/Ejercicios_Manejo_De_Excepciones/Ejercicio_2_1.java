package Practico_7.Ejercicios_Manejo_De_Excepciones;
import java.util.Scanner;

public class Ejercicio_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        try{
            int div = num1 / num2;
            System.out.println("La division es: " + div);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
}

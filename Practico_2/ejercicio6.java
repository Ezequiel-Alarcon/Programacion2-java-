package Practico_2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int AcumPositivos = 0;
        int AcumNegativos = 0;
        int AcumCeros = 0;

        for (i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            int num = sc.nextInt();

            if (num > 0){
                AcumPositivos += 1;
            }else if (num < 0){
                AcumNegativos += 1;
            }else {
                AcumCeros += 1;
            }
        }

        System.out.println("Resultados: ");
        System.out.println("Acum Positivos: " + AcumPositivos);
        System.out.println("Acum Negativos: " + AcumNegativos);
        System.out.println("Acum Ceros: " + AcumCeros);
    }
}

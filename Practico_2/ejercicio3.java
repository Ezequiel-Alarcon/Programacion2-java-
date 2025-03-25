package Practico_2;

import java.util.Scanner;

/*
Ejercicio 3: Clasificación de Edad
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según
la siguiente tabla:
● Menor de 12 años: "Niño"
● Entre 12 y 17 años: "Adolescente"
● Entre 18 y 59 años: "Adulto"
● 60 años o más: "Adulto mayor"
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad <= 0){
            System.out.println("Ingrese una edad valida");
        }else if (edad <= 12){
            System.out.println("Niño");
        }else if (edad < 18){
            System.out.println("Adolescente");
        }else if (edad < 60){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto mayor");
        }
    }
}

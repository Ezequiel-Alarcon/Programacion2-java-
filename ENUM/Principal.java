package ENUM;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un estado del semaforo");

        String estado = sc.nextLine().toUpperCase();
        Semaforo s = Semaforo.valueOf(estado);

//        Semaforo s = Semaforo.VERDE;
        System.out.println("Estado del semaforo:"+ s);

        switch (s) {
            case VERDE:
                System.out.println("avanzar");
                break;
            case AMARILLO:
                System.out.println("Precaución");
                break;
            case ROJO:
                System.out.println("detenerse");
                break;
        }
    }
}

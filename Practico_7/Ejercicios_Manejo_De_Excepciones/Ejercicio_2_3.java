package Practico_7.Ejercicios_Manejo_De_Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo;

        System.out.print("Ingrese el nombre del archivo a leer: ");
        nombreArchivo = sc.nextLine();
        File archivo = new File(nombreArchivo);

        try {
            Scanner lectorArchivo = new Scanner(archivo);
            System.out.println("Contenido del archivo:");
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                System.out.println(linea);
            }
            lectorArchivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no se encontró.");
            System.out.println("Por favor, asegúrese de que el nombre del archivo sea correcto y que el archivo exista.");
        } finally {
            sc.close();
        }
        System.out.println("Fin del programa.");
    }
}

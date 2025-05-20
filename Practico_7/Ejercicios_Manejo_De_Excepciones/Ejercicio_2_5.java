package Practico_7.Ejercicios_Manejo_De_Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Ejercicio_2_5 {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt"; // Nombre del archivo a leer
        // El archivo debe crearse en la misma ubicación del proyecto o proporcionar la ruta absoluta

        // Uso de try-with-resources para garantizar el cierre automático del BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            // Manejar la excepción si el archivo no se encuentra
            System.err.println("Error: No se pudo encontrar el archivo " + nombreArchivo + ".");
            System.err.println("Por favor, asegúrese de que el archivo exista en la ubicación especificada.");
        } catch (IOException e) {
            // Manejar la excepción en caso de error de lectura
            System.err.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
        }

        System.out.println("Fin del programa.");
    }
}


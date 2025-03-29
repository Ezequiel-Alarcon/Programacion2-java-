package Practico_3;

public class Kata_3 {
    public static void main(String[] args) {

        Kata_3_Libro libro = new Kata_3_Libro();

        // Establecer valores para título y autor
        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");

        // Mostrar la información antes de modificar el año
        libro.mostrarLibro();

        // Intentar modificar el año con un valor inválido (no se debería cambiar)
        libro.setAnioPublicacion(1900);

        // Intentar modificar el año con un valor válido
        libro.setAnioPublicacion(2024);

        // Mostrar la información después de modificar el año
        libro.mostrarLibro();
    }
}

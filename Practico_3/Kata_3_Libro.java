package Practico_3;

public class Kata_3_Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;


    void mostrarLibro(){
        System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nAnio: " + this.anioPublicacion);
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio > 1900 && nuevoAnio < 2025){
            this.anioPublicacion = nuevoAnio;
        }
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }






}

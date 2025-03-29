package Practico_3;

public class Kata_1_Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    void mostrarInfo() {
        System.out.println(apellido+"\t"+nombre+"\t"+curso+"\t"+calificacion);
    }


    void subirCalificacion(double puntos) {
        if (puntos < 10 && puntos > 0) {
            calificacion += puntos;
        }
    }

    void bajarCalificacion(double puntos) {
        if (puntos < 10 && puntos > 0 ) {
            calificacion -= puntos;
        }
    }
}

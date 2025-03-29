package Practico_3;
/*
Enunciado
Imagina que estás desarrollando un sistema de gestión de estudiantes para una plataforma
de cursos.
Debes modelar la clase Estudiante con los siguientes atributos y métodos:
Atributos:

nombre (String)
apellido (String)
curso (String)
calificacion (double)

Métodos:
mostrarInfo(): Muestra la información del estudiante (apellido+nombre+curso+calificación)
subirCalificacion(double puntos): Aumenta la calificación del estudiante en la cantidad de puntos especificada (máximo 10).
bajarCalificacion(double puntos): Disminuye la calificación del estudiante (mínimo 0)
 */
public class Kata_1 {
    public static void main(String[] args) {
        Kata_1_Estudiante est = new Kata_1_Estudiante();

        est.nombre = "Jose";
        est.apellido = "Guillermo";
        est.calificacion = 0;
        est.curso = "Programacion 2";

        est.mostrarInfo();
        est.subirCalificacion(10);
        est.mostrarInfo();
        est.bajarCalificacion(2);
        est.mostrarInfo();
    }
}

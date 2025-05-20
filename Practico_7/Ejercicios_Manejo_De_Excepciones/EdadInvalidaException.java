package Practico_7.Ejercicios_Manejo_De_Excepciones;

public class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(int edad){
        super("La edad ingresada (" + edad + ") no es válida. Debe estar entre 0 y 120.");
    }
}

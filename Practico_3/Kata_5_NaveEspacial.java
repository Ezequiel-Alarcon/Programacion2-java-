package Practico_3;

public class Kata_5_NaveEspacial {
    private final String nombre;
    private int combustible;

    public Kata_5_NaveEspacial(int combustible, String nombre) {
        this.combustible = combustible;
        this.nombre = nombre;
    }

    boolean despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("Despegando " + nombre);
            return true; // Éxito
        } else {
            System.out.println("No hay suficiente combustible para despegar");
            return false; // Fallo
        }
    }

    boolean avanzar(int distancia) {
        if (combustible >= distancia) {
            System.out.println("Avanzando: " + distancia);
            combustible -= distancia;
            return true; // Éxito
        } else {
            System.out.println("No es posible avanzar con el combustible actual: " + combustible);
            return false; // Fallo
        }
    }

    boolean recargarCombustible(int cantidad) {
        if (cantidad <= 100 && combustible < 100) {
            combustible += cantidad;
            System.out.println("Recargando: +" + cantidad);
            return true; // Éxito
        } else {
            System.out.println("No es posible recargar combustible");
            return false; // Fallo
        }
    }

    void mostrarEstado(){
        System.out.println("Nombre de la nave: " + nombre + ", combustible: " + combustible);
    }

}

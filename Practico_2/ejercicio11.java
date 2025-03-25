package Practico_2;
import java.util.Scanner;
/*
Declara una variable global DESCUENTO_ESPECIAL = 0.10. Luego, crea un metodo
calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.Dentro del metodo,
declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
 */
public class ejercicio11 {

        // Variable global
        static final double DESCUENTO_ESPECIAL = 0.10;

        public static void calcularDescuentoEspecial(double precio) {
            // Variable local
            double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
            double precioFinal = precio - descuentoAplicado;

            // Mostrar resultados
            System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
            System.out.println("El precio final con descuento es: " + precioFinal);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            calcularDescuentoEspecial(precio);

            scanner.close();
        }
}
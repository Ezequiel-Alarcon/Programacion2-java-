package Practico_2;

/*
Crea un programa que:
1. Declare e inicialice un array con los precios de algunos productos.
2. Use una función recursiva para mostrar los precios originales.
3. Modifique el precio de un producto específico.
4. Use otra función recursiva para mostrar los valores modificados.
 */
public class ejercicio13 {
    public static void main(String[] args) {

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios Originales:");
        mostrarPreciosOriginales(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios Modificados:");
        mostrarPreciosModificados(precios, 0);
    }

    static void mostrarPreciosOriginales(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPreciosOriginales(precios, indice + 1);
    }

    static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPreciosModificados(precios, indice + 1);
    }
}

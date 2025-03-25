package Practico_2;
/*
Crea un programa que:
1. Declare e inicialice un array con los precios de algunos productos.
2. Muestre los valores originales de los precios.
3. Modifique el precio de un producto específico.
4. Muestre los valores modificados.
 */
public class ejercicio12 {
    public static void main(String[] args) {

        double[] precios = {199.99,299.5,149.75,399.0,89.99};

        System.out.println("Precios Originales");
        for ( double precio : precios) {
            System.out.println("Precio: $"+ precio);
        }
        precios[2] = 129.99;

        System.out.println("\nPrecios Modificados ");
        for (double precio : precios) {
            System.out.println("Precio: $"+ precio);
        }
    }
}

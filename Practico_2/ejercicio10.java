package Practico_2;

import java.util.Scanner;

/*

Crea un metodo actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida), que calcule el nuevo stock después de una
venta y recepción de productos:

NuevoStock=StockActual−CantidadVendida+CantidadRecibidaNuevoStock = StockActual - CantidadVendida + CantidadRecibida

Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto: ");
        int stock = sc.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        int nuevoStock = actualizarStock(stock, cantidad, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: "+ nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
        return cantidadRecibida + stockActual - cantidadVendida;
    }

}
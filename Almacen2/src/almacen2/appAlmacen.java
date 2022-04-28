
package almacen2;

import java.util.Scanner;

/**
 *
 * @author theo
 */
public class appAlmacen{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Bebida bebida;
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("\nMenu");
            
            System.out.println("1 Agregar bebida");
            System.out.println("2 Eliminiar bebida");
            System.out.println("3 Mostrar bebidas");
            System.out.println("4 Calcular el precio de las bebidas");
            System.out.println("5 Salir");
            
            System.out.print("eliga una opcion : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    double porcentajeAzucar;
                    boolean promocionAzucar;
                    double cantidadAzucar,
                     precioAzucar;
                    String marcaAzucar;

                    System.out.print("\n Porcentaje del azucar : ");
                    porcentajeAzucar = teclado.nextDouble();

                    System.out.print("Promocion del azucar : ");
                    promocionAzucar = teclado.nextBoolean();

                    System.out.print("Cantidad de azucar : ");
                    cantidadAzucar = teclado.nextDouble();

                    System.out.print("Precio del azucar : ");
                    precioAzucar = teclado.nextDouble();

                    System.out.print("marca del azucar : ");
                    marcaAzucar = teclado.next();

                    bebida = new BebidaAzucarada(cantidadAzucar, precioAzucar, marcaAzucar, porcentajeAzucar, promocionAzucar);
                    almacen.agregarBebida(bebida);
                    System.out.println("");

                    String manatial;
                    double cantidadMineral,
                     precioMineral;
                    String marcaMineral;

                    System.out.print("\ncantidad del mineral : ");
                    cantidadMineral = teclado.nextDouble();

                    System.out.print("precio del mineral : ");
                    precioMineral = teclado.nextDouble();

                    System.out.print("marca del mineral : ");
                    marcaMineral = teclado.next();

                    System.out.print("Dirite el manantial del mineral : ");
                    manatial = teclado.next();

                    bebida = new AguaMineral(cantidadAzucar, precioAzucar, marcaMineral, manatial);
                    almacen.agregarBebida(bebida);
                    break;

                case 2:
                    System.out.print("\nDigite el ID de la bebida para eliminar : ");
                    int id = teclado.nextInt();

                    almacen.eliminarBebida(id);
                    break;

                case 3:
                    almacen.mostrarBebidas();
                    break;

                case 4:
                    System.out.println("\n el precio total de las bebidas es : " + almacen.calcularPrecioBebidas());
                    break;

                case 5:
                    System.out.println("\nFin del programa");
                    opcion = 5;
                    break;

            }
        } while (opcion != 5);
    }
}

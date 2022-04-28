/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen2;

/**
 * @author theo
 */
public class Almacen {

    private Bebida estanteria[][];

    public Almacen(int filas, int columnas) {
        estanteria = new Bebida[filas][columnas];
    }

    public Almacen() {
        estanteria = new Bebida[6][6];
    }

    public void agregarBebida(Bebida bebida) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebida;
                    encontrado = true; // salgo del bucle
                }
            }
        }
        if (encontrado) {
            System.out.println("\nBebida añadida");
        } else {
            System.out.println("\nNo se ha podido añadir la bebida");
        }
    }

    public double calcularPrecioBebidas() {
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }

    public void mostrarBebidas() {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    System.out.println("\nFila : " + i + " - Columna : " + j + "\nBebida : " + estanteria[i][j].toString());
                }
            }
        }
    }

    public void eliminarBebida(int id) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getId() == id) {
                        estanteria[i][j] = null; //Elimino el valor
                        encontrado = true; // salimos del bucle
                    }
                }
            }
        }
        if(encontrado){
            System.out.println("");
            System.out.println("Bebida eliminada");
        }else{
            System.out.println("");
            System.out.println("bebida No eliminada ");
        }
    }
}
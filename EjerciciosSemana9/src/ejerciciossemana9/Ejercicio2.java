/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciossemana9;

/**
 *
 * @author Jairo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                for (int j = 1; j < 13; j++) {
                    System.out.println(arreglo[i] + " * " + j + " = " + arreglo[i] * j);
                }
                System.out.println("\n");
            }

        }

    }
}

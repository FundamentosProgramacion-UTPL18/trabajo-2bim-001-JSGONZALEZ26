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
public class Ejercicio3 {

    public static void main(String[] args) {
        double calificacionesProgramacion[] = {18, 19, 15, 16, 17, 10};
        double calificacionesBasedeDatos[] = {10, 12, 13, 20, 17, 20};
        double promedio[] = new double[6];

        for (int i = 0; i < promedio.length; i++) {
            promedio[i] = (calificacionesProgramacion[i] + calificacionesBasedeDatos[i]) / 2;
        }

        for (int i = 0; i < promedio.length; i++) {
            System.out.println("Promedio del Estudiante " + (i + 1) + " : " + promedio[i]);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.main;

import static es.daw.util.Utilidades.*;

/**
 *
 * @author carlo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1: simplificar una estructura condicional
        System.out.println("Ejercicio 1:");
        exercise1(5);
        exercise1(-2);
        System.out.println();

        // Ejercicio 2: extraer una constante mágica
        System.out.println("Ejercicio 2:");
        exercise2(8);
        exercise2(12);
        System.out.println();

        // Ejercicio 3: renombrar variables para mejorar la legibilidad
        System.out.println("Ejercicio 3:");
        exercise3(3, 4.5);
        System.out.println();

        // Ejercicio 4: separar una función larga en funciones más pequeñas
        System.out.println("Ejercicio 4:");
        System.out.println(exercise4(10, 5));
        System.out.println();

        // Ejercicio 5: eliminar código duplicado
        System.out.println("Ejercicio 5:");
        exercise5(3, 8);
        exercise5(5, 2);
        exercise5(6, 6);
        System.out.println();

        // Ejercicio 6: simplificar el código redundante
        System.out.println("Ejercicio 6:");
        exercise6(1);
        exercise6(4);
        exercise6(8);
    }
}
    


package com.ejerciciosjava;

import java.util.Scanner;

/*
 * Crea un programa que reciba el número de un mes (1-12) y determine a qué trimestre del año pertenece:
 * 1-3: Primer trimestre
 * 4-6: Segundo trimestre
 * 7-9: Tercer trimestre
 * 10-12: Cuarto trimestre
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int mes;
        boolean valido = false;
        String mensaje = "Ingresa un mes (1-12) Siendo enero el 1 y diciembre el 12: ";
        String mensajeError = "Ingrese un dato válido";

        try (Scanner input = new Scanner(System.in)) {
            while (!valido) {
                System.out.println(mensaje);
                if (input.hasNextInt()) {
                    mes = input.nextInt();
                    if (mes >= 1 && mes <= 12) {
                        valido = true;
                    } else {
                        System.out.println(mensajeError + " (debe estar entre 1 y 12)");
                    }
                    switch (mes) {
                        case 1: case 2: case 3: 
                            System.out.println("El mes " + mes + " está en el Primer trimestre.");
                            break;
                        case 4: case 5: case 6: 
                            System.out.println("El mes " + mes + " está en el Segundo trimestre.");
                            break;
                        case 7: case 8: case 9: 
                            System.out.println("El mes " + mes + " está en el Tercer trimestre.");
                            break;
                        case 10: case 11: case 12: 
                            System.out.println("El mes " + mes + " está en el Cuarto trimestre.");
                            break;
                        default:
                            System.out.println("El mes no es válido.");
                            break;
                    }
                } else {
                    System.out.println(mensajeError);
                    input.next(); 
                }
            }

        }
    }
}

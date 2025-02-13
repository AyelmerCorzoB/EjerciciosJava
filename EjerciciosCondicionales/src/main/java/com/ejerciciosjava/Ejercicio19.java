package com.ejerciciosjava;

import java.util.Scanner;

/*
 Crea un programa que solicite la cantidad de sensores activados y el nivel de alerta:

 ° 1-2 sensores : Alerta baja
 ° 3-5 sensores: Alerta media
 ° 6 o mas sensores: Alerta Alta
*/


public class Ejercicio19 {
    public static void main(String[] args) {
        int sensores = 0; 
        boolean valido = false;
        String mensaje = "Ingresa el número de sensores: ";
        try (Scanner input = new Scanner(System.in)) {
            while (!valido) { 
                System.out.println(mensaje);
                if (input.hasNextInt()) {
                    sensores = input.nextInt(); 
                    valido = true; 
                } else {
                    System.out.println("Ingresa un número entero para validar los sensores...");
                    input.next(); 
                }
            }
            System.out.println("Los sensores son: " + sensores); 
            if (sensores > 1 && sensores <= 2) {
                System.out.println("Estamos en Alerta Baja");
            } else if (sensores > 3 && sensores <= 5) {
                System.out.println("Estamos en Alerta Media!");
            } else {
                System.out.println("Estamos en Alerta  ¡¡ALTA!!");
            }
        }
    }
}

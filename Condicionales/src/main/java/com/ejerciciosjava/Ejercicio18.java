package com.ejerciciosjava;

import java.util.Scanner;
/*
Crea un programa que solicite la edad de una persona y determine:

° Si es un bebe(0-2 años)
° Si es un niño(3-12 años)
° Si es un adolecente(13-17 años)
° Si es un adulto(18-64 años)
° Si es un adulto mayor(65 años o mas)

*/
public class Ejercicio18 {
    public static void main(String[] args) {
        int edad;
        boolean valido = false;

        try (Scanner input = new Scanner(System.in)) {
            String mensaje = "Ingrese la edad de la persona: ";
            System.out.print(mensaje);
            while (!valido) {
                if (input.hasNextInt()) {
                    edad = input.nextInt();
                    if (edad >= 0 && edad <= 2) {
                        System.out.println("La persona es un bebé y tiene la edad de: " + edad);
                    } else if (edad >= 3 && edad <= 12) {
                        System.out.println("La persona es un niño y tiene la edad de: " + edad);
                    } else if (edad >= 13 && edad <= 17) {
                        System.out.println("La persona es un adolescente y tiene la edad de: " + edad);
                    } else if (edad >= 18 && edad <= 64) {
                        System.out.println("La persona es un adulto y tiene la edad de: " + edad);
                    } else if (edad >= 65) {
                        System.out.println("La persona es un adulto mayor y tiene la edad de: " + edad);
                    }
                    valido = true;
                } else {
                    System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                    System.out.print(mensaje);
                    input.next(); 
                }
            }
        }
    }
}

package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double temperatura;
        String tipo;
        double resultado;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese la temperatura: ");
            temperatura = input.nextDouble();
            System.out.print("Ingresa si es (C)Celsius o (F)Fahrenheit: ");
            tipo = input.next();

            if (tipo.equalsIgnoreCase("F")) {
                resultado = (temperatura * 9/5) + 32;
                System.out.println("La temperatura en Fahrenheit es: " + resultado);
            } else if (tipo.equalsIgnoreCase("C")) {
                resultado = (temperatura - 32) * 5/9;
                System.out.println("La temperatura en Celsius es: " + resultado);
            } else {
                System.out.println("El tipo de dato es incorrecto o no ingresaste una opción válida.");
            }
        }
    }
}

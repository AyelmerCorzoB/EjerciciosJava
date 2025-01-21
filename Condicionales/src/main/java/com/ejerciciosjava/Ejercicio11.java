package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.println("3. Kilogramos a Libras");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: 
                System.out.print("Ingrese los kilómetros: ");
                double kilometros = scanner.nextDouble();
                if (kilometros < 0) {
                    System.out.println("El valor no puede ser negativo.");
                } else {
                    double millas = kilometros * 0.621371;
                    System.out.println(kilometros + " kilómetros son " + millas + " millas.");
                }
                break;

            case 2: 
                System.out.print("Ingrese la temperatura en Celsius: ");
                double celsius = scanner.nextDouble();
                if (celsius < -273.15) {
                    System.out.println("La temperatura no puede ser menor que el cero absoluto.");
                } else {
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
                }
                break;

            case 3: 
                System.out.print("Ingrese el peso en kilogramos: ");
                double kilogramos = scanner.nextDouble();
                if (kilogramos < 0) {
                    System.out.println("El valor no puede ser negativo.");
                } else {
                    double libras = kilogramos * 2.20462;
                    System.out.println(kilogramos + " kilogramos son " + libras + " libras.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

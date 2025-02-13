package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int año;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingresa el año: ");
            año = input.nextInt();
        }
        
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " es un año común.");
        }
    }
}

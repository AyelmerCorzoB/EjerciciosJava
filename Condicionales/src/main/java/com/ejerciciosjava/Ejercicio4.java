package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int valor1, valor2, valor3;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el valor1: ");
        valor1 = input.nextInt();
        System.out.print("Ingresa el valor2: ");
        valor2 = input.nextInt();
        System.out.print("Ingresa el valor3: ");
        valor3 = input.nextInt();

        if (valor1 == valor2 && valor1 == valor3) {
            System.out.println("El triángulo es equilátero.");
        } else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        input.close();
    }
}

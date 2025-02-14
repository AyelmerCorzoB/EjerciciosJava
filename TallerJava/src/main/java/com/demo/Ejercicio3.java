package com.demo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int edad;
        String nombre;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
            sc.close();
        }
        System.out.println("-----------------------------------");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("-----------------------------------");

    }
}

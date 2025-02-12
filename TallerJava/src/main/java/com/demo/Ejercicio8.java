package com.demo;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Ingrese una cadena: ");
            String cadena = sc.nextLine();

            System.out.print("Ingrese los índices start y end separados por un espacio: ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            if (start >= 0 && end <= 100 || start <= 100 && end >= 0) {
                System.out.println("Subcadena: " + cadena.substring(start, end));

            } else {
                System.out.println("Los índices start y end deben estar entre 0 y 100.");
            }

            sc.close();
        } 
    }
}

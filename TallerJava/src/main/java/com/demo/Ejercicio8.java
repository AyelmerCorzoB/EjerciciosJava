package com.demo;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena: ");
            String cadena = sc.nextLine();

            // Solicitud para el usuario
            // Ejemplo para ingresar
            // Doña Uzeada de Ribera Maldonado de Bracamonte y Anaya era baja, rechoncha,
            // abigotada.1234567890aeiou este texto tiene 100 caracteres
            System.out.print("Ingrese los índices start y end separados por un espacio (0 a 100): ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            // Validar longitud de la cadena
            if (cadena.length() < 1 || cadena.length() > 100) {
                System.out.println("La cadena debe tener entre 1 y 100 caracteres.");
                return;
            }

            // Validar que los índices están dentro del rango permitido
            if (start >= 0 && end <= cadena.length() && start < end) {
                System.out.println("Subcadena: " + cadena.substring(start, end));
            } else {
                System.out.println("Los índices start y end deben cumplir: 0 a 100 la cadena que ingresaste no cumple con los requisitos.");
            }
        }
    }
}

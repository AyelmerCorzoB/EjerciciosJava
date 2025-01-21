package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero;
        int resultado;
        try (
            Scanner input = new Scanner(System.in)) {
            System.out.print("Ingresa tu numero: ");
            numero = input.nextInt();
        }
        if (numero % 2 == 0) {
            resultado = (numero % 2);
            System.out.println("Es numero Par y el resultado para comprobar es: " + resultado);
        } else if (numero % 2 == 1) {
            resultado = (numero % 2);
            System.out.println("Es numero Impar y el resultado para comprobar es: " + resultado);
        }

    }
}
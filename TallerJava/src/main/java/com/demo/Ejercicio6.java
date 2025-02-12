package com.demo;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero;

        System.out.print("Numero a multiplicar del 1 al 10:");
        try (Scanner sc = new Scanner(System.in)) {
            numero = sc.nextInt();
        }
        int tabla = 1;
        do {
            System.out.println(numero + " X " + tabla + " = " + numero * tabla);
            tabla += 1;
        } while (tabla <= 10);
    }
}

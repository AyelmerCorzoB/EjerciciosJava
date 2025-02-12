package com.demo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un numero: ");
            numero = sc.nextInt();
        }
        if (numero %2 ==0) {
            System.out.println("El numero:" + numero+ " Es Par");
        } else {
            System.out.println("El numero:" + numero+ " Es Impar");
        }

    }
}

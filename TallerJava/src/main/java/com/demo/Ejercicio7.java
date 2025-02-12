package com.demo;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numeroUsuario;
        int numeroRandom;
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            int min = 1;
            int max = 100;
            numeroRandom = min + random.nextInt(max - min + 1);
            System.out.println("Ingresa un numero del "+min + " al " + max+".");
            numeroUsuario = sc.nextInt();
        }
        if (numeroUsuario == numeroRandom) {
            System.out.println("Adivinaste!! el numero aleatorio era: " + numeroRandom);
        } else{
            System.out.println("Perdiste!! el numero aleatorio era: " + numeroRandom);
        }

    }
}

package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        double imc;
        double bajoPeso = 18.5;
        double pesoNormal = 24.9;
        double sobrePeso = 29.9;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa tu peso actual Ejemplo(90,0): ");
            imc = sc.nextDouble();
        }
        if (imc <= bajoPeso) {
            System.out.println("Tienes que comer mas tu peso es bajo: (" + imc + ")");
        } else if (imc > bajoPeso && imc <= pesoNormal) {
            System.out.println("Tienes tu peso normal sigue asi: (" + imc + ")");
        } else if (imc > pesoNormal && imc <= sobrePeso) {
            System.out.println("Tienes sobrepeso come sanamente: (" + imc + ")");
        } else {
            System.out.println("Tienes que cuidarte mas estas obeso: (" + imc + ")");
        }
    }
}

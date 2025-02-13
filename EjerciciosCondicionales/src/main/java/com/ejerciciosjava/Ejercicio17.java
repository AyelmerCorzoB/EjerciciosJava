package com.ejerciciosjava;

import java.util.Scanner;
/*
Escribe un programa que solicite la velocidad de un vehiculo(en km/h) y clasifique:

° 0 - 20 km/h: Muy lento
° 20 - 60 km/h: Moderado
° 61 - 120 km/h: Rapido
° mas de 120 km/h: Muy rapido
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        int velocidad;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingresa la velocidad de el vehiculo ejemplo(50): ");
            velocidad = input.nextInt();
        } 
        if (velocidad >0 && velocidad <= 20) {
            System.out.println("Ese es un carro o una tortuga?");
        } else if (velocidad > 21 && velocidad <= 60) {
            System.out.println("Buen kilometraje bro sigue la ley");
        } else if (velocidad > 61 && velocidad <= 120) {
            System.out.println("Wow que? " + velocidad + " km/h estamos en Need For Speed o que???");
        } else if (velocidad > 120) {
            System.out.println("Toreto eres tu?? como llegaste a " + velocidad + "km/h " );
        } else {
            System.out.println("Ingresa un numero valido");
        }
        
    }
}

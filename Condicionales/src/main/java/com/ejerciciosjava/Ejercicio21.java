package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int lados;
        boolean valido = false;
        String mensaje = "Ingresa el numero de lados de tu figura grometrica\nlados (3-6): ";
        String mensajeError = "Ingrese un dato válido";

        try (Scanner input = new Scanner(System.in)) {
            while (!valido) {
                System.out.print(mensaje);
                if (input.hasNextInt()) {
                    lados = input.nextInt();
                    if (lados >= 3 && lados <= 6) {
                        valido = true;
                    } else {
                        System.out.println(mensajeError + " (debe estar entre 3 y 6)");
                    }
                    switch (lados) {
                        case 1: case 2: case 3: 
                            System.out.println("La figura tiene " + lados + " lados por lo cual es un Triangulo.");
                            break;
                        case 4:  
                            System.out.println("La figura tiene " + lados + " lados por lo cual es un Cuadrado o Rectangulo.");
                            break;
                        case 5: 
                            System.out.println("La figura tiene " + lados + " lados por lo cual es un Pentagono.");
                            break;
                        case 6: 
                            System.out.println("La figura tiene " + lados + " lados por lo cual es un Hexagono.");
                            break;
                        default:
                            System.out.println("Figura no soportada.");
                            break;
                    }
                } else {
                    System.out.println(mensajeError);
                    input.next(); 
                }
            }

        }
    }
}

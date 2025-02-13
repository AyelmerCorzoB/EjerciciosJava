package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio15Avanzado {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        String[] menu = {
            "1. Piedra",
            "2. Papel",
            "3. Tijera"
        };

        try (Scanner sc = new Scanner(System.in)) {
            // Entrada de los dos jugadores
            String jugador1 = obtenerEleccion(sc, menu);
            String jugador2 = obtenerEleccion(sc, menu);

            // Mostrar las elecciones de los jugadores
            System.out.println("Jugador 1 eligió: " + jugador1);
            System.out.println("Jugador 2 eligió: " + jugador2);

            // Determinar el resultado
            String resultado = obtenerResultado(jugador1, jugador2);
            System.out.println(resultado);
        }
    }

    // Método para obtener la elección del jugador
    public static String obtenerEleccion(Scanner sc, String[] menu) {
        System.out.println("Jugador elige tu opción:");
        for (String opcion : menu) {
            System.out.println(opcion);
        }

        int opcion = sc.nextInt();
        if (opcion < 1 || opcion > 3) {
            System.out.println("Opción no válida, por favor elige de nuevo.");
            System.exit(0);  // Termina el programa si la opción es inválida
        }

        return menu[opcion - 1].split("\\.")[1].trim(); // Devuelve la elección del jugador
    }

    // Método para obtener el resultado de la partida
    public static String obtenerResultado(String jugador1, String jugador2) {
        if (jugador1.equals(jugador2)) {
            return "Empate";
        }

        switch (jugador1) {
            case "Piedra":
                return jugador2.equals("Papel") ? "Jugador 2 gana porque el papel cubre la piedra" : "Jugador 1 gana porque la piedra le gana a la tijera";
            case "Papel":
                return jugador2.equals("Tijera") ? "Jugador 2 gana porque las tijeras cortan el papel" : "Jugador 1 gana porque el papel cubre la piedra";
            case "Tijera":
                return jugador2.equals("Piedra") ? "Jugador 2 gana porque la piedra le gana a la tijera" : "Jugador 1 gana porque las tijeras cortan el papel";
            default:
                return "Resultado inesperado";
        }
    }
}

package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        String Jugador1 = "";
        String Jugador2 = "";

        String menu1 = """
                Jugador elige tu opcion:
                1. Piedra
                2. Papel
                3. Tijera
                """;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println(menu1);
            int op1 = sc.nextInt();
            switch (op1) {
                case 1:
                    System.out.println("Eligiste piedra");
                    Jugador1 = "Piedra";
                    break;
                case 2:
                    System.out.println("Eligiste Papel");
                    Jugador1 = "Papel";
                    break;
                case 3:
                    System.out.println("Eligiste Tijera");
                    Jugador1 = "Tijera";
                    break;
                default:
                    System.out.println("Opción no válida, por favor elige de nuevo.");
                    return;
            }

            System.out.println(menu1);
            int op2 = sc.nextInt();
            switch (op2) {
                case 1:
                    System.out.println("Eligiste piedra");
                    Jugador2 = "Piedra";
                    break;
                case 2:
                    System.out.println("Eligiste Papel");
                    Jugador2 = "Papel";
                    break;
                case 3:
                    System.out.println("Eligiste Tijera");
                    Jugador2 = "Tijera";
                    break;
                default:
                    System.out.println("Opción no válida, por favor elige de nuevo.");
                    return;
            }
        }

        if (Jugador1.equals("Piedra")) {
            System.out.println("Jugador 1 eligió Piedra");
            if (Jugador2.equals("Piedra")) {
                System.out.println("Jugador 2 eligió Piedra");
                System.out.println("Empate");
            } else if (Jugador2.equals("Papel")) {
                System.out.println("Jugador 2 eligió Papel");
                System.out.println("Jugador 2 gana porque el papel cubre la piedra");
            } else if (Jugador2.equals("Tijera")) {
                System.out.println("Jugador 2 eligió Tijera");
                System.out.println("Jugador 1 gana porque la piedra le gana a la tijera");
            }
        } else if (Jugador1.equals("Papel")) {
            System.out.println("Jugador 1 eligió Papel");
            if (Jugador2.equals("Piedra")) {
                System.out.println("Jugador 2 eligió Piedra");
                System.out.println("Jugador 1 gana porque el papel cubre la piedra");
            } else if (Jugador2.equals("Papel")) {
                System.out.println("Jugador 2 eligió Papel");
                System.out.println("Empate");
            } else if (Jugador2.equals("Tijera")) {
                System.out.println("Jugador 2 eligió Tijera");
                System.out.println("Jugador 2 gana porque las tijeras cortan el papel");
            }
        } else if (Jugador1.equals("Tijera")) {
            System.out.println("Jugador 1 eligió Tijera");
            if (Jugador2.equals("Piedra")) {
                System.out.println("Jugador 2 eligió Piedra");
                System.out.println("Jugador 2 gana porque la piedra le gana a la tijera");
            } else if (Jugador2.equals("Papel")) {
                System.out.println("Jugador 2 eligió Papel");
                System.out.println("Jugador 1 gana porque las tijeras cortan el papel");
            } else if (Jugador2.equals("Tijera")) {
                System.out.println("Jugador 2 eligió Tijera");
                System.out.println("Empate");
            }
        }

    }
}

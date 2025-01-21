package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double monto;
            System.out.print("Ingresa el monto a convertir: ");
            monto = sc.nextDouble();
            int opcion;
            double euro = 0.85;
            int pesos = 4100;
            int yenes = 110;
            String menu = """
                Elige a que moneda lo quieres convertir
                1. Euros
                2. Pesos Colombianos
                3. Yenes
                    """;
            System.out.println(menu);
            opcion = sc.nextInt();
            
            double resultado;
            resultado = switch (opcion) {
                case 1 -> monto * euro;
                case 2 -> monto * pesos;
                case 3 -> monto * yenes;
                default -> {
                    System.out.println("Opción inválida.");
                    yield -1; 
                }
            };
            
            if (resultado != -1) {
                System.out.println("El resultado es: " + resultado);
            }
        }
    }
}

package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int clima;
        int hora;
        String climaIngresado = ""; 
        String horaIngresada = ""; 

        System.out.println("Según el clima te recomendaremos comida para la ocasión.");
        System.out.println("Empecemos con el clima, elige:");
        String menuClima = """ 
        1. Soleado
        2. Lluvioso
        3. Frío
        """;
        String menuHora = """ 
        1. Mañana
        2. Tarde
        3. Noche
        """;

        try (Scanner input = new Scanner(System.in)) {
            
            boolean climaValido = false;
            while (!climaValido) {
                System.out.println(menuClima); 
                clima = input.nextInt();
                
                climaIngresado = switch (clima) {
                    case 1 -> "Soleado";
                    case 2 -> "Lluvioso";
                    case 3 -> "Frío";
                    default -> {
                        System.out.println("El dato es inválido, vuelve a ingresar...");
                        yield "";  
                    }
                };
                if (!climaIngresado.isEmpty()) {
                    climaValido = true;
                }
            }

            System.out.println("Perfecto, el clima es: " + climaIngresado);

            
            boolean horaValida = false;
            while (!horaValida) {
                System.out.println("Ahora, ¿qué hora es?");
                System.out.println(menuHora);
                hora = input.nextInt();
                
                if (hora == 1) {
                    horaIngresada = "Mañana";
                    horaValida = true;
                } else if (hora == 2) {
                    horaIngresada = "Tarde";
                    horaValida = true;
                } else if (hora == 3) {
                    horaIngresada = "Noche";
                    horaValida = true;
                } else {
                    System.out.println("El dato es inválido, vuelve a ingresar...");
                }
            }

            System.out.println("Perfecto, la hora es: " + horaIngresada);

            
            System.out.println("Te recomendamos una comida según el clima y la hora:");
            if ("Soleado".equals(climaIngresado)) {
                if ("Mañana".equals(horaIngresada)) {
                    System.out.println("Desayuno: Una ensalada fresca o fruta.");
                } else if ("Tarde".equals(horaIngresada)) {
                    System.out.println("Almuerzo: Un sandwich o ensalada.");
                } else {
                    System.out.println("Cena: Algo ligero como una ensalada.");
                }
            } else if ("Lluvioso".equals(climaIngresado)) {
                if ("Mañana".equals(horaIngresada)) {
                    System.out.println("Desayuno: Un desayuno caliente, como un café con pan.");
                } else if ("Tarde".equals(horaIngresada)) {
                    System.out.println("Almuerzo: Una sopa o estofado.");
                } else {
                    System.out.println("Cena: Un guiso caliente.");
                }
            } else if ("Frío".equals(climaIngresado)) {
                if ("Mañana".equals(horaIngresada)) {
                    System.out.println("Desayuno: Un desayuno con huevos revueltos y café.");
                } else if ("Tarde".equals(horaIngresada)) {
                    System.out.println("Almuerzo: Un plato de pasta o carne a la parrilla.");
                } else {
                    System.out.println("Cena: Una sopa o un plato de comida reconfortante.");
                }
            }
        }
    }
}

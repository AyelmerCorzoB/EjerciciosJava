package com.ejerciciosenclase;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double montoCuenta, porcentaje, propina, total;

        do {
            System.out.println("=============================================");
            System.out.println("             SIMULADOR DE PROPINA             ");
            System.out.println("=============================================");
            System.out.println("1. Calcular propina y total a pagar");
            System.out.println("2. Calcular total a pagar divido entre varias personas");
            System.out.println("3. Salir");
            System.out.println("=============================================");
            System.out.print("Por favor, elige una opción (1-3): ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("             Cálculo de Propina             ");
                    System.out.println("=============================================");
                    System.out.print("Ingrese el monto total de la cuenta: $");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Monto no válido. Ingrese un número decimal.");
                        sc.next(); 
                    }
                    montoCuenta = sc.nextDouble();
                    System.out.print("Ingrese el porcentaje de propina (ejemplo: 15): ");

                    
                    while (!sc.hasNextDouble()) {
                        System.out.println("Porcentaje no válido. Ingrese un número decimal.");
                        sc.next(); 
                    }
                    porcentaje = sc.nextDouble();

                    propina = montoCuenta * (porcentaje / 100);
                    total = montoCuenta + propina;

                    System.out.println("=============================================");
                    System.out.printf("La propina calculada es: $%.2f%n", propina);
                    System.out.printf("El total a pagar es: $%.2f%n", total);
                    System.out.println("=============================================");
                    break;

                case 2:
                    System.out.println("=============================================");
                    System.out.println("  Dividir Cuenta entre Varias Personas  ");
                    System.out.println("=============================================");
                    System.out.print("Ingrese el monto total de la cuenta: $");

                    
                    while (!sc.hasNextDouble()) {
                        System.out.println("Monto no válido. Ingrese un número decimal.");
                        sc.next(); 
                    }
                    montoCuenta = sc.nextDouble();

                    System.out.print("Ingrese el porcentaje de propina (ejemplo: 15): ");

                    
                    while (!sc.hasNextDouble()) {
                        System.out.println("Porcentaje no válido. Ingrese un número decimal.");
                        sc.next(); 
                    }
                    porcentaje = sc.nextDouble();

                    System.out.print("Ingrese el número de personas: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Número de personas no válido. Ingrese un número entero.");
                        sc.next(); 
                    }
                    int numPersonas = sc.nextInt();

                    propina = montoCuenta * (porcentaje / 100);
                    total = (montoCuenta + propina) / numPersonas;

                    System.out.println("=============================================");
                    System.out.printf("Cada persona debe pagar: $%.2f%n", total);
                    System.out.println("=============================================");
                    break;

                case 3:
                    System.out.println("Saliendo del simulador...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 3.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
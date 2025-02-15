package com.ejerciciosenclase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String menu = """
                    =============================================
                    \tSIMULADOR DE PROPINA
                    =============================================
                    1. Calcular propina y total a pagar
                    2. Calcular total a pagar divido entre varias personas
                    3. Salir
                    =============================================
                    Por favor, elige una opción (1-3): """;
            String menu1 = """
                    =============================================
                    \tCálculo de Propina
                    =============================================
                    """;
            String menu2 = """
                    =============================================
                    \tDividir Cuenta entre Varias Personas
                    =============================================
                    """;
            int opcion;
            do {
                System.out.print(menu);
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        char repetir;
                        do {

                            System.out.print(menu1);
                            System.out.print("Ingrese el monto total de la cuenta: $");
                            double montoP = sc.nextDouble();
                            System.out.print("Ingrese el porcentaje de propina (por ejemplo: 15): ");
                            int porcentaje = sc.nextInt();
                            System.out.println("=============================================");
                            double propinaCalculada = montoP * porcentaje / 100;
                            double totalPagar = montoP + propinaCalculada;
                            System.out.println("La propina calculada es: $" + propinaCalculada);
                            System.out.println("El total a pagar es: $" + totalPagar);
                            System.out.println("=============================================");
                            System.out.println("¿Deseas calcular nuevamente? (S/N)");
                            repetir = sc.next().charAt(0);

                        } while (repetir == 'S' || repetir == 's');
                        break;
                    case 2:
                        char repetir2;
                        do {
                            System.out.println(menu2);
                            System.out.print("Ingrese el monto total de la cuenta: $");
                            double montoP2 = sc.nextDouble();
                            System.out.print("Ingrese el porcentaje de propina (por ejemplo: 15):");
                            int porcentaje2 = sc.nextInt();
                            System.out.print("Ingrese el número de personas: ");
                            int numeroPersonas = sc.nextInt();
                            System.out.println("=============================================");
                            double propinaCalculada2 = montoP2 * porcentaje2 / 100;
                            double totalPagar2 = montoP2 + propinaCalculada2;
                            double montoPorPersona = totalPagar2 / numeroPersonas;
                            System.out.println("La propina calculada es: $" + propinaCalculada2);
                            System.out.println("El total a pagar es: $" + totalPagar2);
                            System.out.println("Monto por persona: $" + montoPorPersona);
                            System.out.println("=============================================");
                            System.out.println("¿Deseas calcular nuevamente? (S/N)");
                            repetir2 = sc.next().charAt(0);

                        } while (repetir2 == 'S' || repetir2 == 's');
                        break;
                    case 3: 
                        System.out.println("Saliendo...");
                        break;
                    default:
                    System.out.println("Opcion no valida...");
                        break;
                }
            } while (opcion != 3);
        }
    }
}
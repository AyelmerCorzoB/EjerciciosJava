package com.ejerciciosenclase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        String opcionSalir;
        String menu = """
                =============================================
                  SIMULADOR DE PROPINA
                =============================================
                1. Calcular propina y total a pagar
                2. Calcular total a pagar divido entre varias personas
                3. Salir
                =============================================
                                """;
        String menu1 = """
                =============================================
                    Cálculo de Propina
                =============================================
                """;
        String menu2 = """
                =============================================
                    Dividir Cuenta entre Varias Personas
                =============================================
                """;

        do {
            System.out.println(menu);
            System.out.print("Por favor, elige una opcion (1-3): ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(menu1);
                    System.out.print("Ingrese l monto total de la cuenta : $");
                    double montoCuenta = sc.nextDouble();
                    System.out.print("Ingrese el porcentaje de propina(por ejemplo: 15)");
                    int porcentaje = sc.nextInt();
                    System.out.println("=============================================");
                    double resultado = montoCuenta * porcentaje;
                    System.out.println("La propina calculada es: $" + resultado);
                    double resultadofinal = resultado + montoCuenta;
                    System.out.println("El total es: $" + resultadofinal);
                    System.out.println("=============================================");
                    System.out.println("¿Deseas calcular nuevamente? (S/N)");
                    opcionSalir = sc.nextLine();
                    if (opcionSalir.equals("s") || opcionSalir.equals("S")) {
                        valido = true;
                    }
                    break;
                case 2:
                    System.out.println("Calcular la propina y dividir la cuenta entre varias personas");
                    break;
                case 3:
                    System.out.println("Salir...");
                default:
                    System.out.println("Opcion no valida...");
                    break;
            }
        } while (!valido);

    }
}
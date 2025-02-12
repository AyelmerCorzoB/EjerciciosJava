package com.demo;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el monto de Inversion: ");
            double mInversion = sc.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaInteresAnual = sc.nextDouble();

            System.out.print("Ingrese el plazo de Inversion (en años): ");
            int plazoAnios = sc.nextInt();

            String menuFrecuencia = """
                    Seleccione la frecuencia de capitalización:
                    1. Mensual
                    2. Trimestral
                    3. Semestral
                    4. Anual
                    """;
            System.out.println(menuFrecuencia);
            System.out.print("Opcion:");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }

            // double tasaInteresMensual = (tasaInteresAnual / 100) / 12;
            // int numeroPagos = plazoAnios * 12;

            // double cuotaMensual = (mInversion * tasaInteresMensual) /
            //         (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));

            // System.out.printf("%-6s %-15s %-15s %-10s %-10s %-15s%n",
            //         "Cuota", "Saldo Inicial", "Cuota Mensual", "Interés", "Capital", "Saldo Pendiente");
            // System.out.println("-------------------------------------------------------------------------------");

            // double saldoPendiente = mInversion;

            // for (int cuota = 1; cuota <= numeroPagos; cuota++) {
            //     double interesPagado = saldoPendiente * tasaInteresMensual;
            //     double capitalPagado = cuotaMensual - interesPagado;
            //     double saldoInicial = saldoPendiente;
            //     saldoPendiente -= capitalPagado;

            //     System.out.printf("%-6d %-15.2f %-15.2f %-10.2f %-10.2f %-15.2f%n",
            //             cuota, saldoInicial, cuotaMensual, interesPagado, capitalPagado, saldoPendiente);
            // }

            // sc.close();
        }
    }
}

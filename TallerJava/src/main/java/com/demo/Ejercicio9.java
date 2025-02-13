package com.demo;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Solicitar datos al usuario
            System.out.print("Ingrese el monto del préstamo: ");
            double montoP = sc.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            double tasaInteresAnual = sc.nextDouble();

            System.out.print("Ingrese el plazo del préstamo (en años): ");
            int plazoAnios = sc.nextInt();

            // Cálculo de operaciones de guia
            double tasaInteresMensual = (tasaInteresAnual / 100) / 12;
            int numeroPagos = plazoAnios * 12;

            double cuotaMensual;

            cuotaMensual = (montoP * tasaInteresMensual) /
                    (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));

            System.out.printf("%-6s %-15s %-15s %-10s %-10s %-15s%n",
                    "Cuota", "Saldo Inicial", "Cuota Mensual", "Interés", "Capital", "Saldo");
            System.out.println("-------------------------------------------------------------------------------");

            double saldoPendiente = montoP;

            for (int cuota = 1; cuota <= numeroPagos; cuota++) {
                double interesPagado = saldoPendiente * tasaInteresMensual;
                double capitalPagado = cuotaMensual - interesPagado;
                double saldoInicial = saldoPendiente;
                saldoPendiente -= capitalPagado;

                System.out.printf("%-6d %-15.2f %-15.2f %-10.2f %-10.2f %-15.2f%n",
                        cuota, saldoInicial, cuotaMensual, interesPagado, capitalPagado, saldoPendiente);
            }
        }
    }
}

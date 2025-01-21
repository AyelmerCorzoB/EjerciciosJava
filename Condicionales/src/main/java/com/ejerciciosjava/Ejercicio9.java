package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int mes;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println("Ingrese el número del mes (1-12):");
                mes = input.nextInt();

                if (mes >= 1 && mes <= 12) {
                    switch (mes) {
                        case 1:
                            System.out.println("Enero (Invierno)");
                            break;
                        case 2:
                            System.out.println("Febrero (Invierno)");
                            break;
                        case 3:
                            System.out.println("Marzo (Primavera)");
                            break;
                        case 4:
                            System.out.println("Abril (Primavera)");
                            break;
                        case 5:
                            System.out.println("Mayo (Primavera)");
                            break;
                        case 6:
                            System.out.println("Junio (Verano)");
                            break;
                        case 7:
                            System.out.println("Julio (Verano)");
                            break;
                        case 8:
                            System.out.println("Agosto (Verano)");
                            break;
                        case 9:
                            System.out.println("Septiembre (Otoño)");
                            break;
                        case 10:
                            System.out.println("Octubre (Otoño)");
                            break;
                        case 11:
                            System.out.println("Noviembre (Otoño)");
                            break;
                        case 12:
                            System.out.println("Diciembre (Invierno)");
                            break;
                    }
                    break;
                } else {
                    System.out.println("Número de mes no válido. Debe ser entre 1 y 12.");
                }
            } while (mes < 1 || mes > 12);
        }
    }
}

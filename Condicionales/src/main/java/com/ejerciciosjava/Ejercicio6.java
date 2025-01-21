package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int horas;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de horas: ");
        horas = input.nextInt();

        if (horas <= 0) {
            System.out.println("Error: La cantidad de horas debe ser mayor que cero.");
        } else if (horas <= 1) {
            System.out.println("El valor a pagar es 5$");
        } else if (horas <= 3) {
            System.out.println("El valor a pagar es 10$");
        } else if (horas >= 4) {
            System.out.println("El valor a pagar es 15$");
        } else {
            System.out.println("Por favor contacte a un supervisor para más detalles sobre el cobro.");
        }
        


        input.close();
    }
}


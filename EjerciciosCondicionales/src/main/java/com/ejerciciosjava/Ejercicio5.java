package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int precio;
        String tipoCliente;
        double resultado;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        precio = input.nextInt();

        input.nextLine();

        System.out.print("Ingresa el tipo de cliente (A / B / C): ");
        tipoCliente = input.nextLine();

        if (tipoCliente.equalsIgnoreCase("A")) { 
            resultado = precio - (precio * 0.30); 
        } else if (tipoCliente.equalsIgnoreCase("B")) {
            resultado = precio - (precio * 0.20); 
        } else if (tipoCliente.equalsIgnoreCase("C")) {
            resultado = precio - (precio * 0.10); 
        } else {
            System.out.println("Tipo de cliente no válido.");
            input.close();
            return;
        }

        System.out.println("El precio final después del descuento es: " + resultado);

        input.close();
    }
}


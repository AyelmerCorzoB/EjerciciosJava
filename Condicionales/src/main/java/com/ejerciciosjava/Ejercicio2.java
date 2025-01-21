package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int valor;
        int valor2;
        String op;
        boolean son = true;
        
        Scanner input = new Scanner(System.in);  

        while (son) {
            try {
                System.out.print("Ingresa tu primer valor: ");
                valor = input.nextInt();
                System.out.print("Ingresa tu segundo valor: ");
                valor2 = input.nextInt();
                System.out.println("Que operacion deseas realizar? ( + , - , * , / )");
                op = input.next();
                
                switch (op) {
                    case "+":
                        int suma = valor + valor2;
                        System.out.println("El resultado es " + suma);
                        son = false;
                        break;
                    case "-":
                        int resta = valor - valor2;
                        System.out.println("El resultado es " + resta);
                        son = false;
                        break;
                    case "*":
                        int multiplicacion = valor * valor2;
                        System.out.println("El resultado es " + multiplicacion);
                        son = false;
                        break;
                    case "/":
                        if (valor2 != 0) {  
                            int division = valor / valor2;
                            System.out.println("El resultado es " + division);
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                        son = false;
                        break;
                    default:
                        System.out.println("Ingrese un dato valido...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Por favor ingresa solo números.");
                input.next();  
            }
        }
        
        input.close();
    }
}

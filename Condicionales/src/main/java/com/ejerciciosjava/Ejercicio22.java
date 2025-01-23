package com.ejerciciosjava;

import java.util.Scanner;

/*
 * Crear un programa que reciba un mes(1-12) y un dia (1-31) y demuestre el signo zodiacal de la persona.
 * Aries: 21 de marzo - 19 de abril
 * Tauro: 20 de abril - 20 de mayo
 * Géminis: 21 de mayo - 20 de junio
 * Cáncer: 21 de junio - 22 de julio
 * Leo: 23 de julio - 22 de agosto
 * Virgo: 24 de agosto - 22 de septiembre
 * Libra: 23 de septiembre - 22 de octubre
 * Escorpio: 23 de octubre - 21 de noviembre
 * Sagitario: 22 de noviembre - 21 de diciembre
 * Capricornio: 22 de diciembre - 19 de enero
 * Acuario: 20 de enero - 18 de febrero
 * Piscis: 19 de febrero - 20 de marzo
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        int mes;
        int dia;
        boolean valido = false;

        try (Scanner input = new Scanner(System.in)) {
            while (!valido) {
                System.out.print("Ingrese el mes (1-12): ");
                mes = input.nextInt();
                System.out.print("Ingrese el dia (1-31): ");
                dia = input.nextInt();

                if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
                    valido = true;
                    if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                        System.out.println("Eres Aries");
                    } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                        System.out.println("Eres Tauro");
                    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                        System.out.println("Eres Géminis");
                    } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                        System.out.println("Eres Cáncer");
                    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                        System.out.println("Eres Leo");
                    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                        System.out.println("Eres Virgo");
                    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                        System.out.println("Eres Libra");
                    } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                        System.out.println("Eres Escorpio");
                    } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                        System.out.println("Eres Sagitario");
                    } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                        System.out.println("Eres Capricornio");
                    } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                        System.out.println("Eres Acuario");
                    } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                        System.out.println("Eres Piscis");
                    }
                } else {
                    System.out.println("Ingrese un mes y dia validos.");
                }
            }

        }
    }
}

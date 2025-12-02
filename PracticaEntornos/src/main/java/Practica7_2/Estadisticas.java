package Practica7_2;

import java.util.Scanner;

public class Estadisticas {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿Cuántos valores quieres introducir?");
        int cantidad = sc.nextInt();
        int suma = 0;
        int maximo = 0;
        int minimo = 0;
        int pares = 0;
        int impares = 0;
        boolean primero = true;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce un número:");
            int num = sc.nextInt();
            suma = suma + num;
            if (primero) {
                maximo = num;
                minimo = num;
                primero = false;
            } else {
                if (num > maximo) {
                    maximo = num;
                }
                if (num < minimo) {
                    minimo = num;
                }
            }
            if (num % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }

        double media = (double) suma / cantidad;
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}


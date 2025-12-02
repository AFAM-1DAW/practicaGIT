package Practica7_2;

import java.util.Scanner;

public class Calculadora {
    private static Scanner sc = new Scanner(System.in);

    // Nuevo metodo para evitar duplicado
    private static int pedirNumero() {
        System.out.println("Introduce número:");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int option = 0;
        int total = 0;
        while (option != 4) {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Mostrar total");
            System.out.println("4. Salir");
            System.out.println("Elige opción:");
            option = sc.nextInt();
            switch (option) {
                case 1: {

                    int numeroUsuario = pedirNumero();
                    total = total + numeroUsuario;
                    System.out.println("Total: " + total);
                    break;
                }
                case 2: {
                    int numeroUsuario = pedirNumero();
                    total = total - numeroUsuario;
                    System.out.println("Total: " + total);
                    break;
                }
                case 3: {
                    System.out.println("Total actual: " + total);
                    break;
                }
                case 4: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("Opción incorrecta");
                }
            }
        }
    }
}


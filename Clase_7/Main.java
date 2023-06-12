package Clase_7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números ingresados son :");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int mayor = 0;
        int menor =numeros[0];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero >= mayor) {
                mayor = numero;
            }

            if (numero <= menor) {
                menor = numero;
            }

            suma += numero;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Promedio: " + promedio);
    }
}
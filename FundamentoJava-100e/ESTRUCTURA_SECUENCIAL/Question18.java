package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos números desea ingresar? ");
        int cantidad = sc.nextInt();

        // Crear el arreglo para almacenar los números
        int[] numeros = new int[cantidad];

        // Ingresar los números uno por uno
        for(int posicion = 0; posicion < cantidad; posicion++) {
            System.out.println("Ingrese el número " + (posicion + 1) + ": ");
            numeros[posicion] = sc.nextInt();
        }

        System.out.println("\n⚙️  Ordenando números...");

        // Ordenar de mayor a menor usando el método de burbuja
        for(int vuelta = 0; vuelta < cantidad - 1; vuelta++) {
            System.out.println("--- Vuelta " + (vuelta + 1) + " ---");

            for(int posicionActual = 0; posicionActual < cantidad - 1 - vuelta; posicionActual++) {
                int numeroActual = numeros[posicionActual];
                int numeroSiguiente = numeros[posicionActual + 1];

                System.out.printf("Comparando: [%d] vs [%d] ", numeroActual, numeroSiguiente);

                // Si el número actual es MENOR que el siguiente, los intercambiamos
                if(numeroActual < numeroSiguiente) {
                    System.out.printf("→ INTERCAMBIO (%.1f < %.1f)%n", (float)numeroActual, (float)numeroSiguiente);

                    // Intercambiar posiciones
                    int temporal = numeros[posicionActual];
                    numeros[posicionActual] = numeros[posicionActual + 1];
                    numeros[posicionActual + 1] = temporal;
                } else {
                    System.out.printf("→ MANTENER (%.1f >= %.1f)%n", (float)numeroActual, (float)numeroSiguiente);
                }
            }

            // Mostrar estado actual del arreglo después de cada vuelta
            System.out.print("Estado actual: ");
            for(int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }

        // Mostrar resultados finales
        System.out.println("🎉 ¡ORDENACIÓN COMPLETADA!");
        System.out.println("Números ordenados de mayor a menor:");

        for(int posicion = 0; posicion < cantidad; posicion++) {
            System.out.printf("Posición %d: %d%n", (posicion + 1), numeros[posicion]);
        }

        // Información adicional
        System.out.println("\n📊 Resumen:");
        System.out.println("Número más grande: " + numeros[0]);
        System.out.println("Número más pequeño: " + numeros[cantidad - 1]);
        System.out.println("Total de números ordenados: " + cantidad);
    }
}
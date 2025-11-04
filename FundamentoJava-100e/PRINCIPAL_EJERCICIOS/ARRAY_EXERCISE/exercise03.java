package PRINCIPAL_EJERCICIOS.ARRAY_EXERCISE;

import java.util.Random;
import java.util.Scanner;

public class exercise03 {

    private static char[][] tablero = new char[3][3];
    private static char jugador = 'X';
    private static char maquina = 'O';
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        inicializarTablero();

        System.out.println("🎮 Bienvenido al juego del Tres en Raya (Tic-Tac-Toe)");
        System.out.print("¿Quieres empezar tú? (s/n): ");
        boolean turnoJugador = sc.next().equalsIgnoreCase("s");

        mostrarTablero();

        while (true) {
            if (turnoJugador) {
                realizarJugadaJugador();
            } else {
                realizarJugadaMaquina();
            }

            mostrarTablero();

            if (verificarGanador(jugador)) {
                System.out.println("🏆 ¡Felicidades! Ganaste la partida.");
                break;
            } else if (verificarGanador(maquina)) {
                System.out.println("💻 La máquina ha ganado. ¡Suerte para la próxima!");
                break;
            } else if (tableroLleno()) {
                System.out.println("🤝 Empate. ¡Buen juego!");
                break;
            }

            // Cambiar turno
            turnoJugador = !turnoJugador;
        }

        sc.close();
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("\n🟩 TABLERO ACTUAL:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void realizarJugadaJugador() {
        int fila, columna;
        while (true) {
            System.out.print("\n👉 Ingresa tu jugada (fila y columna, ej: 0 2): ");
            fila = sc.nextInt();
            columna = sc.nextInt();

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
                if (tablero[fila][columna] == '-') {
                    tablero[fila][columna] = jugador;
                    break;
                } else {
                    System.out.println("⚠️ Esa posición ya está ocupada. Intenta otra.");
                }
            } else {
                System.out.println("⚠️ Posición inválida. Usa valores entre 0 y 2.");
            }
        }
    }

    private static void realizarJugadaMaquina() {
        System.out.println("\n🤖 La máquina está pensando...");
        try {
            Thread.sleep(1000); // Pausa de 1 segundo para dar realismo
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        int fila, columna;
        while (true) {
            fila = random.nextInt(3);
            columna = random.nextInt(3);
            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = maquina;
                System.out.printf("💻 La máquina coloca en (%d,%d)\n", fila, columna);
                break;
            }
        }
    }

    private static boolean verificarGanador(char simbolo) {
        // Filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo)
                return true;
            if (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo)
                return true;
        }

        // Diagonales
        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo)
            return true;
        if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo)
            return true;

        return false;
    }

    private static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

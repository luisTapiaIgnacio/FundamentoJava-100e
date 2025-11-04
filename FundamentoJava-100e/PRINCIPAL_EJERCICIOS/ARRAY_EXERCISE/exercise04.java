package PRINCIPAL_EJERCICIOS.ARRAY_EXERCISE;
//Sistema de Análisis de Temperaturas
public class exercise04 {

        public static void main(String[] args) {
            // Temperaturas diarias de una semana (en °C)
            double[] temperaturas = {22.5, 24.3, 19.8, 21.2, 26.7, 23.4, 20.1};
            String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

            System.out.println("=== ANÁLISIS DE TEMPERATURAS SEMANALES ===");

            // Mostrar temperaturas
            for (int i = 0; i < dias.length; i++) {
                System.out.printf("%-10s: %.1f°C%n", dias[i], temperaturas[i]);
            }

            // Análisis avanzado
            double suma = 0;
            double maxTemp = temperaturas[0];
            double minTemp = temperaturas[0];
            int diaMax = 0, diaMin = 0;

            for (int i = 0; i < temperaturas.length; i++) {
                suma += temperaturas[i];

                if (temperaturas[i] > maxTemp) {
                    maxTemp = temperaturas[i];
                    diaMax = i;
                }

                if (temperaturas[i] < minTemp) {
                    minTemp = temperaturas[i];
                    diaMin = i;
                }
            }

            double promedio = suma / temperaturas.length;

            System.out.println("\n📈 ANÁLISIS DETALLADO:");
            System.out.printf("Temperatura promedio: %.2f°C%n", promedio);
            System.out.printf("Día más caluroso: %s (%.1f°C)%n", dias[diaMax], maxTemp);
            System.out.printf("Día más frío: %s (%.1f°C)%n", dias[diaMin], minTemp);
            System.out.printf("Rango de temperaturas: %.1f°C%n", maxTemp - minTemp);

            // Días sobre el promedio
            System.out.println("\n☀️ DÍAS SOBRE EL PROMEDIO:");
            for (int i = 0; i < temperaturas.length; i++) {
                if (temperaturas[i] > promedio) {
                    System.out.printf("- %s: +%.1f°C sobre el promedio%n",
                            dias[i], temperaturas[i] - promedio);
                }
            }

    }
}

package PRINCIPAL_EJERCICIOS.ARRAY_EXERCISE;
//sistema de calificaciones con estadisticas
public class exercise02 {
    public static void main(String[] args) {



                // Arreglo de calificaciones de un grupo
                double[] calificaciones = {8.5, 7.2, 9.1, 6.8, 8.9, 7.5, 9.8, 6.2, 8.0, 7.7};
                String[] estudiantes = {"Ana", "Luis", "Maria", "Carlos", "Sofia", "Pedro", "Laura", "Juan", "Elena", "Diego"};

                System.out.println("=== SISTEMA DE CALIFICACIONES ===");

                // Mostrar calificaciones
                for (int i = 0; i < estudiantes.length; i++) {
                    String estado = calificaciones[i] >= 7.0 ? "APROBADO" : "REPROBADO";
                    System.out.printf("%-8s: %.1f - %s%n", estudiantes[i], calificaciones[i], estado);
                }

                // Cálculos estadísticos
                double suma = 0;
                double max = calificaciones[0];
                double min = calificaciones[0];

                for (double calificacion : calificaciones) {
                    suma += calificacion;
                    if (calificacion > max) max = calificacion;
                    if (calificacion < min) min = calificacion;
                }

                double promedio = suma / calificaciones.length;

                System.out.println("\n📊 ESTADÍSTICAS:");
                System.out.printf("Promedio del grupo: %.2f%n", promedio);
                System.out.printf("Calificación más alta: %.1f%n", max);
                System.out.printf("Calificación más baja: %.1f%n", min);

                // Contar aprobados y reprobados
                int aprobados = 0;
                for (double calificacion : calificaciones) {
                    if (calificacion >= 7.0) aprobados++;
                }
                System.out.printf("Aprobados: %d/%d (%.1f%%)%n",
                        aprobados, calificaciones.length,
                        (aprobados * 100.0 / calificaciones.length));
            }


}

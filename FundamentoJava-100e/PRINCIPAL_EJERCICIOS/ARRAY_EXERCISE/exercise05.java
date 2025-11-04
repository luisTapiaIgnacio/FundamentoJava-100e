package PRINCIPAL_EJERCICIOS.ARRAY_EXERCISE;
//Sistema de Cifrado César
public class exercise05 {

        public static void main(String[] args) {
            String textoOriginal = "HOLA MUNDO JAVA";
            int desplazamiento = 3;

            System.out.println("=== SISTEMA DE CIFRADO CÉSAR ===");
            System.out.println("Texto original: " + textoOriginal);
            System.out.println("Desplazamiento: " + desplazamiento);

            // Convertir a arreglo de caracteres
            char[] caracteres = textoOriginal.toCharArray();

            // Cifrar el texto
            char[] textoCifrado = cifrarTexto(caracteres, desplazamiento);
            System.out.println("Texto cifrado: " + new String(textoCifrado));

            // Descifrar el texto
            char[] textoDescifrado = descifrarTexto(textoCifrado, desplazamiento);
            System.out.println("Texto descifrado: " + new String(textoDescifrado));
        }

        private static char[] cifrarTexto(char[] texto, int desplazamiento) {
            char[] resultado = new char[texto.length];

            for (int i = 0; i < texto.length; i++) {
                char c = texto[i];

                if (Character.isLetter(c)) {
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    resultado[i] = (char)(((c - base + desplazamiento) % 26) + base);
                } else {
                    resultado[i] = c; // Mantener espacios y otros caracteres
                }
            }

            return resultado;
        }

        private static char[] descifrarTexto(char[] texto, int desplazamiento) {
            return cifrarTexto(texto, 26 - desplazamiento); // Desplazamiento inverso
        }

}

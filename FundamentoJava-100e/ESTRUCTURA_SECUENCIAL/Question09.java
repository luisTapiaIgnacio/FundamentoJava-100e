package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Crear un programa para encontrar el área de un círculo, use la fórmula:
public class Question09 {
    public static void main(String[] args) {
        final float PI=3.14f;
        float area, radio;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el radio:" );
        radio=sc.nextFloat();
        area=(float)(PI*(Math.pow((double) radio, 2.0)));
        System.out.println("el area es: "+area);
    }
}

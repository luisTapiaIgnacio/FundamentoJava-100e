package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Hallar la potencia de a", donde <<a>> y <<n» pertenecen a z• (números enteros positivos).
public class Question04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num=sc.nextInt();
        System.out.println("ingrese la potencia: ");
        int pow=sc.nextInt();

        double resultado=Math.pow(num, pow);

        System.out.println("el resultado es: "+resultado);
    }
}

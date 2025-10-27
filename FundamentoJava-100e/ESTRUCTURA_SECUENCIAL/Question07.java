package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

//Determinar la suma de los N primeros números enteros positivos (z•¡. Use la siguiente
//fórmula.s=(n(n+1)/2)
public class Question07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero: ");
        int num=sc.nextInt();
        int s=(num*(num+1)/2);

        System.out.println("la suma es: "+s);
    }
}

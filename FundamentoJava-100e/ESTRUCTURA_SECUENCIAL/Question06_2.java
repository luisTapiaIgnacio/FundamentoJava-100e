package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Dado un número de S dígitos, devolver el número en orden inverso.
public class Question06_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los numeros: ");
        String numeros=sc.nextLine();


    for (int i=numeros.length()-1; i>=0;i--){
        System.out.print(numeros.charAt(i));
    }

    sc.close();
    }
}

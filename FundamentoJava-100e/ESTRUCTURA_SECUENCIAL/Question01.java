package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

//dado 2 numeros enteros hallar la suma
public class Question01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("deme el 1er valor: ");
        int num1=sc.nextInt();
        System.out.println("deme el 2do valor: ");
        int num2=sc.nextInt();
        int suma=num1+num2;
        System.out.println("la suma es: "+suma);
    }
}

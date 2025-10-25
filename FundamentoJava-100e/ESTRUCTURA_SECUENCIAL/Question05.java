package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Hallar la radicación de !l[a , donde <<a» y «n>> pertenecen a z• (números enteros positivos).
public class Question05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num=sc.nextInt();
        System.out.println("ingrese el indice: ");
        int n=sc.nextInt();
//proceso
        int raiz;
        raiz=(int)Math.pow(num, 1.0/n);

        System.out.println("La raiz es: "+raiz);
    }
}

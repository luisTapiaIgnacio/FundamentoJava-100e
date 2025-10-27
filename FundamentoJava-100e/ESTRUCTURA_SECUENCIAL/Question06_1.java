package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

//delvre de forma invertida un texto
public class Question06_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String texto=sc.nextLine();
        char lista[]=texto.toCharArray();
        for (int i=lista.length-1; i>=0; i--){
            System.out.print(lista[i]+"-");
        }

        System.out.println(lista[1]);
    }
}

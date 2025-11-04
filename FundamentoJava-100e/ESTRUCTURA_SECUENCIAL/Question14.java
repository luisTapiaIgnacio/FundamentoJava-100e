package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Determinar si un número es múltiplo de 3 y 5.
public class Question14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese numero: ");
        int numero=sc.nextInt();
        if(numero%3==0 && numero%5==0){
            System.out.println(numero + " ES MULTIPLO DE: 3 y 5");
        }else {
            System.out.println(numero + " NO ES MULTIPLO DE: 3 y 5");
        }
        sc.close();
    }
}

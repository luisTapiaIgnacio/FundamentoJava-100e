package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Dado un número de S dígitos, devolver el número en orden inverso
public class Question06 {
    public static void main(String[] args) {
    int  n, r;
    int ni=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero");

        n=sc.nextInt();
        while ( n>0){
            r=n%10;//obtener el ultimo digito
            ni=ni*10+r; //agregar al numero invertido

            n=n/10; //eliminar el ultimo digito original
        }

        System.out.println("Inverso: "+ni);

    }
}

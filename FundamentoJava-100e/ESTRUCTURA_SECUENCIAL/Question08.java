package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Calcular el interés compuesto generado por un capital depositado durante cierta cantidad de
//tiempo, a una tasa de interés determinada; aplique las siguientes fórmulas:
//monto(c)-capitalñ(c)-interes - tiempo
public class Question08 {
    public static void main(String[] args) {
//variables
        float c,r,t,i,m;

        Scanner sc=new Scanner(System.in);
        System.out.println("Capital: ");
        c=sc.nextFloat();
        System.out.print("Tasa de interes: ");
        r=sc.nextFloat();
        System.out.println("!Tiempo: ");
        t=sc.nextFloat();
        //proceso
        m= (float) (Math.pow((double) (1+r/100), (double) t)*c);
        i=m-c;
        System.out.println("");
        System.out.println("interes: "+i);
        System.out.println("monto: "+m);
    }
}

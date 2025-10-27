package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Crear un programa que permita convertir una cantidad de segundos en horas, minutos y
//segundos.
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //constantes
        final int hora=3600;
        final int minuto=60;
        //variables
        int t,h,m,s;
        System.out.println("Ingrese tiempo en segundos: ");
        t=sc.nextInt();
        //proceso
       h=t/hora;
       t=t%hora;

       m=t/minuto;
       s=t%minuto;

        //salida

        System.out.println("HORA: "+h);
        System.out.println("MINUTOS: "+m);
        System.out.println("SEGUNDOS: "+s);
    }
}

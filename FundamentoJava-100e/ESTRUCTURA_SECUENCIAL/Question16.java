package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

//Dados tres números enteros, devolver el número mayor.
public class Question16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el 1er numero: ");
        int num1=sc.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        int num2=sc.nextInt();
        System.out.println("Ingrese el 3er numero: ");
        int num3=sc.nextInt();

        int numMayor=num1;
        if(num2>numMayor && num2>num3){
            numMayor=num2;
        }
        else if(num3>numMayor){
            numMayor=num3;
        }

        System.out.println("es numero mayor es: "+ numMayor);
    }

}

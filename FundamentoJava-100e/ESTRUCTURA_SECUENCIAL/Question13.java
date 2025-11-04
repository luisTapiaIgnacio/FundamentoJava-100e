package ESTRUCTURA_SECUENCIAL;

import java.util.Scanner;

// Dado un carácter determinar si es una vocal.
public class Question13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arrayVocales={'a','e','i','o','u'};
        System.out.println("Ingrese un caracter: ");
       char input= sc.next().charAt(0);
       //usamos bandera flag
        boolean esVocal=false;
        for(char vocal:arrayVocales){
            if(vocal==Character.toLowerCase(input)){
                esVocal=true;
                break;//salimos si es verdedero
            }
        }
        if (esVocal) {
            System.out.println("es vocal...!");
        } else{
            System.out.println("no es vocal...!");
        }

    }
}

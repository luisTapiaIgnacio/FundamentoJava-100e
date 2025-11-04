package ESTRUCTURA_SECUENCIAL;
//Determinar si un número entero es positivo, negativo o neutro.
public class Question11 {
    public static void main(String[] args) {
        int num=0;
        String denominacion="";
        if(num>0){
            denominacion="POSITIVO";
            System.out.println("el numero "+num+" ES: "+denominacion);
        }else if(num<0){
            denominacion="NEGATIVO";
            System.out.println("el numero "+num+" ES: "+denominacion);
        }
        else {
            System.out.println("el numero es NEUTRO");
        }
    }
}

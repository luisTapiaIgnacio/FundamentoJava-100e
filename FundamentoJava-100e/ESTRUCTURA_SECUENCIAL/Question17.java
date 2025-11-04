package ESTRUCTURA_SECUENCIAL;
// Dado un número, devolver el doble si el número no es par, caso contrario el triple
public class Question17 {
    public static void main(String[] args) {
        int num = 11;
        if(num%2==0){
            num*=2;
            System.out.println(num);
        }else{
            num*=3;
            System.out.println("triple: "+num);
        }
    }
}

package ESTRUCTURA_SECUENCIAL;

public class Question13_3 {
    public static void main(String[] args) {
        char[] arrayVocal={'a','e','i','o','u'};
        char input='U';

        if(esVocal(input, arrayVocal)){
            System.out.println("ES VOCAL");
        }else {
            System.out.println("NO ES VOCAL...!");
        }
    }

    public static boolean esVocal(char letra, char[]vocales){
        for(char vocal:vocales){
            if(Character.toLowerCase(letra)==vocal){
                return true;
            }

        }
        return false;
    }
}

package ESTRUCTURA_SECUENCIAL;
//Dado el valor de venta de un producto, hallar eiiGV (19 %) y el precio de venta.
public class Question03 {
    public static void main(String[] args) {
        float precioProd=100f;
        float igv=precioProd*0.19f;
        double precioTotal=precioProd+igv;
        System.out.println("el igv del producto es: "+igv);
        System.out.println("el precio de venta es: "+precioTotal);
    }
}

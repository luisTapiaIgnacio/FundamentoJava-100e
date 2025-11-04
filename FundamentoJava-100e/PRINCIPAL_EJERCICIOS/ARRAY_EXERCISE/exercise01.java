package PRINCIPAL_EJERCICIOS.ARRAY_EXERCISE;
/*

 Características Clave:

    Tamaño fijo (definido al crearlo)

    Acceso rápido por índice (0-based)

    Elementos contiguos en memoria

    Mismo tipo de dato para todos los elementos
 */
public class exercise01 {
    public static void main(String[] args) {
        //Sistema de Gestión de Inventario
        String[] productos={"parlante", "monitor", "teclado", "maus", "laptop"};
        double[] precio={50.40, 250.00, 20.00, 10.00, 2050.00};
        int[] stock={100, 50, 55, 80, 55};

        System.out.println("**********INVENTARIO DE TIENDA: ***********");
        for(int i=0; i<productos.length; i++){
            double valorTotal=precio[i]*stock[i];
            System.out.printf("%-10s |  PRECIO: $%-8.2f  | STOCK: %-3d | VALOR: $%-10.2f%n",
                    productos[i], precio[i], stock[i], valorTotal);
        }
        //total de inventario
        double valorInventario=0;
        for(int i=0; i<productos.length; i++){
          //  valorInventario=valorInventario+precio[i]*stock[i];
            //es igual a:
            valorInventario +=precio[i]*stock[i];

        }
        System.out.println("====================================================");
        System.out.printf("\n VALOR TOTAL DEL INVENTARIO: $%.2f%n", valorInventario);
        System.out.println("=====================================================");
    }
}

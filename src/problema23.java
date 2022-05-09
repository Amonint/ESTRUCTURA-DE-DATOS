import java.util.Scanner;

/* Realice un programa con arreglos unidimensionales que permita almacenar los códigos y el
número de productos en existencia de artículos de una tienda. Muestre una lista de los
productos que necesitan ser reabastecidos en la tienda (cantidad menor o igual al mínimo
requerido ej: 5) */
public class problema23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vec = new int[10];
        int i, n, dato,posi;
        for (i = 0; i < 10; i++) {
            vec[i] = 0;
        }

        //ingreso de datos
        // System.out.println("");
        System.out.print("Articulos de la tienda por restablecer:\n"+"-Papel,-Aguacate,-Arroz,-Crema de cacahuate,-Crema para café,-Puré de tomate,-Alimento para bebé,-Alimento para mascotas ,-Atole,-Azúcar\n");
        System.out.print("Cuantos desea ingresar ?:");
        n = entrada.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Producto[" + i + "]:");
            vec[i] = entrada.nextInt();
        }
        //IMPRIMIR VECTOR
        System.out.println("Digite el numero del producto que desea ingresar o digito del que desea eliminar");
        for (i = 0; i < 10; i++) {
            System.out.print(vec[i] + " \n");
        }
        System.out.print("Ingrese el numero del producto a elininar :");
        dato = entrada.nextInt();
        if (n < 10) { //hay espacio
            vec[n] = dato;
            n++;
        }else{
            posi=0;
            for (i = 0; i < 10; i++) {
                if(vec[i]==dato){
                    posi=i;
                }
            }
            //elimnar
            for (i = posi; i < 9; i++) {
                vec[i]=vec[i+1];
                vec[9]=0;
            }
            
        }
        //IMPRIMIR VECTOR
        System.out.println("Datos del vector");
        for (i = 0; i < 10; i++) {
            System.out.print(vec[i] + " , ");
        }
    }
}

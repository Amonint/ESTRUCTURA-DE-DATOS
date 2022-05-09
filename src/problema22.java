import java.util.Scanner;

public class problema22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vec = new int[10];
        int i, n, dato,posi;
        for (i = 0; i < 10; i++) {
            vec[i] = 0;
        }

        //ingreso de datos
        // System.out.println("");
        System.out.print("Cuantos desea ingresar ?:");
        n = entrada.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Vec[" + i + "]:");
            vec[i] = entrada.nextInt();
        }
        //IMPRIMIR VECTOR
        System.out.println("Datos del vector");
        for (i = 0; i < 10; i++) {
            System.out.print(vec[i] + " , ");
        }
        System.out.print("Ingrese Dato :");
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
            }
            vec[9]=0;
        }
        //IMPRIMIR VECTOR
        System.out.println("Datos del vector");
        for (i = 0; i < 10; i++) {
            System.out.print(vec[i] + " , ");
        }
    }
}

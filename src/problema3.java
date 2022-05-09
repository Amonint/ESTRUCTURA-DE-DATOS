

import java.util.Scanner;


public class problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, k, n;
        int suma = 0;
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        //ingreso de datos
        System.out.println("DATOS DE VECTOR A");
        for (k = 0; k < A.length; k++) {
            System.out.print("A[" + k + "]:");
            A[k] = entrada.nextInt();
        }
        System.out.println("DATOS DE VECTOR B");
        for (k = 0; k < B.length; k++) {
            System.out.print("B[" + k + "]:");
            B[k] = entrada.nextInt();
        }
        System.out.println("DATOS INGRESADOS");
        //recorrer el vector
        for (k = 0; k < A.length; k++) {
            System.out.print(A[k] + " , ");
        }
        System.out.println("");
        for (k = 0; k < B.length; k++) {
            System.out.print(B[k] + " , ");
        }
        //PASAR DATOS A C
        for (k = 0; k < A.length; k++) {
            if (A[k] < B[k]) {
                C[k] = A[k];
            } else {
                C[k] = B[k];
            }
        }
        //imprimir C
        System.out.println("");
        for (k = 0; k < C.length; k++) {
            System.out.print(C[k] + " , ");
        }

    }
}
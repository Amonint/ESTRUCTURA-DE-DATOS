import java.util.Scanner;

/* Crear un programa que ingrese un arreglo unidimensional. Calcule el promedio de los elementos
y forme dos nuevos arreglos, uno con los elementos menores o iguales al promedio y otro con
los superiores. Muestre todos los arreglos. */

public class problema5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];
        int i;
        int a, b, suma;
        int prom, prom2;
        System.out.println("INGRESO DE DIGITOS");
        for (i = 0; i < A.length; i++) {
            System.out.print("Dato[" + i + "]:");
            A[i] = entrada.nextInt();
        }
        suma = 0;
        prom = 0;
        for (i = 0; i < A.length - 1; i++) {
            suma = suma + A[i];
            prom = prom + suma / 4;
            prom2 = prom;
        }

        System.out.println("Promedio=" + prom);
        for (i = 0; i < A.length; i++) {
            if (A[i] <= prom) {
                C[i] = A[i];
                System.out.printf(C[i]+"   " +" son menores al promedio \n");
            
               
            } else {
    
                B[i] = A[i];
                System.out.printf(B[i]+ "   "+"son mayores al promedio \n");
    
            } 
            System.out.println(".......................................");        
        
        
        }
       
      
    }
}

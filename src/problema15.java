import java.util.Scanner;

public class problema15 {
    public static Scanner sc = new Scanner(System.in);
    public static int ev = 0;

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        llenarOrdenado(arreglo);
        presentarArreglo(arreglo);
    }

    public static void llenarOrdenado(int[] x) {
        int n, pos;
        for (int i = 0; i < x.length; i++) {
            n = sc.nextInt();
            if( i == 0) {
                x[0] = n;
            } else {
                pos = buscar(x, n);
                moverDerecha(x, pos);
                x[pos] = n;
                
            }
            ev++;
        }
    }

    public static int buscar(int[] x, int num) {
        int c = 0;
        while (c < ev && num > x[c]) {
            c++;
        }
        return c;
    }

    public static void presentarArreglo(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%s ", x[i]);
        }
        System.out.println();
    }

    public static void moverDerecha(int[] x, int pos) {
        
        for (int i = ev - 1; i >= pos; i--) {

            x[i + 1] = x[i];
        }
    }
}

import java.util.Scanner;
public class problema6 {
    Scanner entrada = new Scanner(System.in);
    public void leer(int[] X) {
        for (int i = 0; i < X.length; i++) {
            System.out.println("Ingrese elemento:");
            X[i] = entrada.nextInt();
        }
    }

    public void calcula(int[] X, int[] Y, int[] Z) {
        int j = X.length - 1;
        for (int i = 0; i < X.length; i++) {
            Z[i] = X[i] * Y[j];
            j--;
        }
    }

    public void presentar(int[] X) {
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i] + "   ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        problema6 obj = new problema6();
        // int ev;
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        obj.leer(A);
        obj.leer(B);
        obj.calcula(A, B, C);
        obj.presentar(A);
        obj.presentar(B);
        obj.presentar(C);

    }

}

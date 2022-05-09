import java.util.Scanner;

public class problema14 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        leerArreglo(vector1);
        leerArreglo(vector2);
        ordenar1(vector1);
        ordenar2(vector2,0, 9);
        System.out.println("Vector 1 ordenado:");
        presentarArreglo(vector1, 10);
        System.out.println("Vector 2 ordenado:");
        presentarArreglo(vector2, 10);

    }

    public static void leerArreglo(int[] x) {
        System.out.println("Llenar Vector");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
    }

    public static void presentarArreglo(int[] x, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.printf("%s ", x[i]);
        }
        System.out.println();
    }

    public static void ordenar1(int[] x) {
        int aux;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenar2(int[] x, int ini, int fin) {
        int aux;
        int a=ini, b=fin;
        int piv = x[(ini + fin)/ 2];
        do{
            while(x[a]<=piv)
                a++;
            while(x[b]>=piv)
                b--;
            if(a<b){
                aux = x[a];
                x[a] = x[b];
                x[b] = aux;
            }else {
                a++;
                b--;
            }
        }while(a<=b);
        if(ini<b)
            ordenar2(x, ini, b);
        if(a<fin)
            ordenar2(x, a, fin);
    }
}

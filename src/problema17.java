import java.util.Scanner;

public class problema17 {
    public static Scanner sc = new Scanner(System.in);
    public static int indice = 10;

    public static void main(String[] args) {
        int evA = 0;
        int evB = 0;
        int evC = 0;
        int[] conjuntoA = new int[indice];
        int[] conjuntoB = new int[indice];
        int[] union = new int[indice * 2];
        System.out.println("Conjunto A"); evA = leerConjunto(conjuntoA);
        System.out.println("Conjunto B"); evB = leerConjunto(conjuntoB);
        evC = restarConjuntos(conjuntoA, conjuntoB, union, evA, evB);
        System.out.println("Conjunto A"); presentarArreglo(conjuntoA, evA);
        System.out.println("Conjunto B"); presentarArreglo(conjuntoB, evB);
        System.out.println("resta de conjuntos A - B"); presentarArreglo(union, evC);

    }

    public static int leerConjunto(int[] x) {
        int n, sig, ev = 0;
        do{
            System.out.println("Ingrese elemento: ");
            n = sc.nextInt();
            ev = insertar(x,ev,n);
            System.out.println("Otro? ");
            System.out.println("1) Si");
            System.out.println("2) No");
            sig = sc.nextInt();
        }while(sig == 1 && ev < indice);
        return ev;
    }

    public static int insertar(int[]x, int ev, int n){
        if(busqueda(x, n, ev) == -1){
            x[ev] = n;
            ev ++;
        }else{
            System.out.println("Elemento repetido ");
        }
        return ev;
    }

    public static int busqueda(int[] x, int n, int ev) {
        for (int i = 0; i < ev; i++) {
            if (x[i] == n) {
                return i;
            }   
        }
        return  - 1;
    }

    public static int restarConjuntos(int[] x, int[] y, int[] z, int evx, int evy) {
        int ev = 0, c = 0;
        for (int i = 0; i < evx; i++) {
            if (busqueda(y, x[i], evy) == -1) {
                z[c] = x[i];
                c ++;
                ev ++;
            }
        }
        return ev;  
    }

    public static void presentarArreglo(int[] x, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.printf("%s ", x[i]);
        }
        System.out.println();
    }
}

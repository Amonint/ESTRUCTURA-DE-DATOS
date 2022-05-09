
import java.util.Scanner;

public class problema16 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] conjunto1;
        int[] conjunto2;
        problema16 obj = new problema16();
        
        System.out.println("Ingrese el numero de elementos el conjunto A");
        conjunto1 = new int[obj.sc.nextInt()];

        System.out.println("Ingrese el numero de elementos el conjunto B");
        conjunto2 = new int[obj.sc.nextInt()];

        System.out.println("-----Datos conjunto 1-----");
        ingresarDatos(conjunto1);

        System.out.println("-----Datos conjunto 2-----");
        ingresarDatos(conjunto2);

        union(conjunto1, conjunto2);
    }

    public static void ingresarDatos(int[] X) {
        problema16 obj = new problema16();
        for (int i = 0; i < X.length; i++) {
            System.out.println("Datos para la posicion [" + (i+1) + "]: ");
            X[i] = obj.sc.nextInt();
            if(existe(X[i], X)){
                System.out.println("Elemento ya se encuentra en el conjunto, ingrese nuevos datos para");
                i--;
            }
        }
    }

    public static boolean existe(int num, int X[]) {
        int contador = 0;
        for (int i = 0; i < X.length; i++) {
            if (num == X[i]){
                contador++;
            }
        }
        if (contador > 1) {
            return true;
        }else{
            return false;
        }
    }

    public static void union(int[] conjunto1, int[] conjunto2) {
        int[] arregloFinal = new int[conjunto1.length+conjunto2.length];
        boolean esta = false;
        int posicionNueva = conjunto1.length;

        for (int i = 0; i < conjunto1.length; i++) {
            arregloFinal[i] = conjunto1[i];
        }

        for (int i = 0; i < conjunto2.length; i++) {
            esta =false;
            for (int j = 0; j < conjunto1.length; j++) {
                if (conjunto2[i] == conjunto1[j]) {
                    esta = true;
                }
            }
            if (!esta) {
                arregloFinal[posicionNueva] = conjunto2[i];
                posicionNueva++;
            }
        }

        System.out.println("-----Conjunto final union A+B-----");
        for (int i = 0; i < posicionNueva; i++) {
            System.out.println("Dato [" + (i + 1) + "]: " + arregloFinal[i]);
        }
    }
}

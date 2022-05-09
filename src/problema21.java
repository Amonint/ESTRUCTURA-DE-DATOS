
import java.util.Scanner;

public class problema21 {
    Scanner leer = new Scanner(System.in);

    public int busquedabinaria(int[] x, int elemento, int inicio, int fin) {
        int medio = (inicio + fin) / 2;
        if (inicio >= fin) {
            return -1;
        } else if (x[medio] == elemento) {
            return medio;
        } else if (x[medio] < elemento) {
            return busquedabinaria(x, elemento, medio + 1, fin);
        } else {
            return busquedabinaria(x, elemento, inicio, fin - 1);
        }
    }

    public static void main(String[] args) {
        problema21 objeto = new problema21();
        int num;
        int vector[] = { 1, 3, 4, 5, 6, 7, 12, 6 };
        System.out.println("Elemento a buscar:");
        num = objeto.leer.nextInt();
        if (objeto.busquedabinaria(vector, num, 0, vector.length) > 0) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}

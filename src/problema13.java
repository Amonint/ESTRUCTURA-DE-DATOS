import java.util.Scanner;

public class problema13 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] socios = new String[10];
        leerArreglo(socios);
        presentarArreglo(socios, 10);
    }

    public static void leerArreglo(String[] x) {
        System.out.println("Llenar Vector");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            x[i] = sc.nextLine();
        }
    }

    public static void presentarArreglo(String[] x, int ev) {
        System.out.printf("%-15s%15s%n", "Socio", "Longitud");
        for (int i = 0; i < ev; i++) {
            System.out.printf("%-15s%15s%n", x[i], x[i].length());
        }
    }
    
}

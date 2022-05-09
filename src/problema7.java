import java.util.Scanner;

public class problema7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float[] linea1 = new float[12];
        float[] linea2 = new float[12];
        float[] linea3 = new float[12];
        System.out.println("Linea 1:");
        leerArreglo(linea1);
        System.out.println("Linea 2:");
        leerArreglo(linea2);
        System.out.println("Linea 3:");
        leerArreglo(linea3);
        System.out.println("Recaudacion");
        System.out.println("Recaudacion total por Linea");
        System.out.println("Linea 1:"); ;
        System.out.println(totalLinea(linea1));
        System.out.println("Linea 2:"); ;
        System.out.println(totalLinea(linea2));
        System.out.println("Linea 3:"); 
        System.out.println(totalLinea(linea3));
        System.out.println("Recaudacion Por Vehiculo");
        for (int i = 0; i < linea1.length; i++) {
            System.out.print("Vehiculo " + (i + 1) + " :" + totalVehiculo(linea1, linea2, linea3, i) + " \n"); 
        }
        System.out.println("Total General");
        System.out.println(totalGeneral(linea1, linea2, linea3));


    }


    public static void leerArreglo(float[] x) {
        System.out.println("Llenar Vector");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Vehiculo " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
    }

    public static float totalLinea(float[] x) {
        float total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }

    public static float totalVehiculo(float[] x, float[] y, float[] z, int numVehiculo) {
        return x[numVehiculo] + y[numVehiculo] + z[numVehiculo];

    }
    
    public static float totalGeneral(float[] x, float[] y, float[] z) {
        float total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i] + y[i] + z[i];
        }
        return total;

    }
}

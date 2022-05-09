import java.util.Scanner;

public class problema12 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float[] alumnos = new float[10];
        leerArreglo(alumnos);
        System.out.println("Notas Ingresadas");
        presentarArreglo(alumnos, 10);
        System.out.print("Estudiantes aprobados: " +  aprobados(alumnos) + "\n");
        System.out.print("Estudiantes reprobados: " +  reprobados(alumnos) + "\n");

    }

    public static void leerArreglo(float[] x) {
        System.out.println("Llenar Vector");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
    }

    public static int aprobados(float[] x) {
        int aprobados = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 7) {
                aprobados ++;
            }
        }
        return aprobados;
    }

    public static int reprobados(float[] x) {
        int reprobados = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 7) {
                reprobados ++;
            }
        }
        return reprobados;
    }

    public static void presentarArreglo(float[] x, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.printf("%s ", x[i]);
        }
        System.out.println();
    }

    
}

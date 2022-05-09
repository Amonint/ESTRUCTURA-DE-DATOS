import java.util.Scanner;

public class problema19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ced = new int[10];
        int i;
        int a, b, suma, ultimo;
        System.out.println("INGRESO DE DIGITOS");
        for (i = 0; i < 10; i++) {
            System.out.print("Ced[" + i + "]:");
            ced[i] = entrada.nextInt();
        }
        ///Mostrar cedula
        for (i = 0; i < 10; i++) {
            System.out.print(ced[i] + ",");
        }
        //proceso de verificar
        suma = 0;
        for (i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                a = ced[i] * 2;
                if (a > 9) {
                    a = a - 9;
                }
                suma = suma + a;
            } else {
                suma = suma + ced[i];
            }
        }
        System.out.println("Suma=" + suma);
        if (suma % 10 == 0) {
            ultimo = 0;
        } else {
            ultimo = 10 - (suma % 10);
        }
        if(ultimo==ced[9]){
            System.out.println("CEDULA VALIDA");
        }else{
            System.out.println("NUMERO DE CEDULA NO VALIDA");
        }
    }
}

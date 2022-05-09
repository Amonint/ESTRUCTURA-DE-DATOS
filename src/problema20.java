
import java.util.Scanner;
public class problema20{
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int desde = 2;
    int hasta = 999983;
    boolean esPrimo;
    int cp=0;
    int nb=0;
    int ip=0;
    int n=0;
    int k=0;
    System.out.println("Introduce posición: ");
    nb=entrada.nextInt();
    int vp[]= new int[nb];

    for (int i = desde; i <= hasta; i++) {
        esPrimo = true;

        for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
            if (i % j == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo && cp<nb){ 

            esPrimo=true;
            cp++;
            k=i;
            vp[n++]=k;
        }if(cp>=nb){
            break;
        }
    }System.out.println(vp[vp.length-1]);
 }
}  
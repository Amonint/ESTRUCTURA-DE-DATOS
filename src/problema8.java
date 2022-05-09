import java.util.Scanner;
/* Desarrolle un programa que permita registrar el ingreso de números desde teclado en dos
arreglos, ubicando los números pares en el arreglo numpar y los impares en el arreglo
numimpar. */

public class problema8 {

    public static void main(String[] args) {
        //Objeto scanner
        Scanner entrada = new Scanner(System.in);
        //Variables
        int[] a = new int[10];
        int[] numpar = new int[10];
        int[] numimpar = new int[10];
      
        
        //Ingresar datos al arreglo
        for(int i=0; i<a.length; i++){
            System.out.print((i+1)+".Ingrese un numero: ");
            a[i] = entrada.nextInt();
            
        }
        //Clasificar pares e impares
        for(int i=0; i<a.length; i++){
            if(a[i]%2 == 0){
                numpar[i]=a[i]  ;
                
                System.out.println(numpar[i]);
            }
            
        }
        System.out.println("vale");
        for(int i=0; i<a.length; i++){
            if(a[i]%2 != 0){
                numimpar[i]=a[i]  ;
                
                System.out.println(numimpar[i]);
            }
           
        }
        
        

    }   
}

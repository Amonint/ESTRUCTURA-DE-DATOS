import java.util.Scanner;

public class problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diaMayor, diaMenor, i;
        int a[] ;
        
        double aguaMm, cantidadMayor, cantidadMenor, promedio;
        diaMayor = 0;
        diaMenor = 0;
        cantidadMayor = 0;
        cantidadMenor = 0;
        promedio = 0;
        for (i=1; i<=30; i++) {
            System.out.println("Dia:" +  i);
            System.out.print("Ingresa el valor de cantidad de agua en mm: ");
            aguaMm = entrada.nextDouble();
            entrada.nextLine();
            promedio=promedio+aguaMm;
            if(i==1||cantidadMayor<aguaMm)
            {
                cantidadMayor=aguaMm;
                diaMayor=i;
            }
            if(i==1||cantidadMenor>aguaMm)
            {
                cantidadMenor=aguaMm;
                diaMenor=i;
            }
            System.out.println();
        }
        promedio=promedio/30;
        System.out.println("Valor de dia mayor: " + diaMayor);
        System.out.println("Valor de dia menor: " + diaMenor);
        System.out.println("Valor de cantidad mayor: " + cantidadMayor);
        System.out.println("Valor de cantidad menor: " + cantidadMenor);
        System.out.println("Valor de promedio: " + promedio);
    }

}
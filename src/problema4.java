public class problema4 {

    public static void main(String[] args) {

        int numeros [] = {1,2,5,10,20,45,46,80}; //VECTOR DE NUMEROS.

        int sumaTotal = 0;
        int sumaImpares=0; //CONTADOR INICIADO A CERO.

        for(int i=0; i<numeros.length;i++)
        {  
            if(i%2==0) //VERIFICAMOS SI LA POCISION i ES PAR O NO.
            {
               sumaTotal = sumaTotal + numeros[i]; //SUMAMOS VALOR DE i A CONTADOR
            } else
            sumaImpares= sumaImpares+ numeros[i];
               
        }

        System.out.println("Suma de los pares es : " + sumaTotal);
        System.out.println("Suma de los impares es : " + sumaImpares);
    }
}
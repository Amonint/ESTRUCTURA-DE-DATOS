import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problema18 {
    public static Scanner sc = new Scanner(System.in);
    public static int indice = 10;

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,2,2,2,2,3,6,6,6,6,6,6,};
        int [] arr2 = {7,5,3,6,6,2,2,3,6,6,6,6,6,6,6,6,};
    
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList result = new ArrayList<>();
        int i =0 ;
        int j =0;
        while(i< arr1.length && j<arr2.length){
        if (arr1[i]>arr2[j]){
            j++;
    
        }else if (arr1[i]<arr2[j]){
            i++;
    
        }else {
            result.add(arr1[i]);
            i++;
            j++;
        }
        }
        System.out.println(result);
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class ReverseTheArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ;i <size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
              arr[i] = arr[arr.length-i-1];
              arr[arr.length-i-1] = temp;
        }

       System.out.println("Reversed Array: "+ Arrays.toString(arr));

         
        
    }
}

import java.util.Scanner;

public class HalfAscHalfDescSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        halfAsendDesend(arr);

    }

    public static void halfAsendDesend(int arr[]){


        for(int i = 0; i<arr.length; i++){

            for(int j = 0; j< arr.length/2; j++){

                if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
                }

            }

            for(int k = arr.length/2; k < arr.length-1; k++){

                if(arr[k] < arr[k+1]){
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
                }

            }

        }
        

        for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
        }

        

    }

}
import java.util.Scanner;
import java.util.Arrays;

public class  MedianOfArray{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if(size % 2 != 0){
            double med = arr[size / 2];
           System.out.println("Median is: "+ med);

        }else{
            double med = arr[size / 2] + arr[(size/2)-1];
            double median = med / 2.0;
            System.out.println("Median is: "+median);
    
    }
}
}
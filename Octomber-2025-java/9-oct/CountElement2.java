import java.util.Scanner;

public class CountElement2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0 ; i< size; i++){
            arr[i] = sc.nextInt();
        }
         
      
        int totalDup = 0;
        for(int i = 0; i<size; i++){
              int count = 1;
            for(int j = i+1; j<size; j++){
                
                 if(arr[i] == arr[j]){
                   
                      count++;
               
               }
            }
             if(count ==2){
                totalDup++;
            }
        }

       

        System.out.println("Number of elements occurring more than once: "+totalDup);
        }




    }

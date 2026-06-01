import java.util.Scanner;

public class CountUniqueElement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0 ; i< size; i++){
            arr[i] = sc.nextInt();
        }
         
      
        int totalUni = 0;
        for(int i = 0; i<size; i++){
              int count = 0;
            for(int j = 0; j<size; j++){
                
                 if(arr[i] == arr[j]){               
                      count++;
               
               }
            }
             if(count == 1){
                totalUni++;
            }
        }

       

        System.out.println("Number of unique elements: "+totalUni);
        }
    }

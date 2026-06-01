import java.util.Scanner;

public class CountElement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0 ; i< size; i++){
            arr[i] = sc.nextInt();
        }
         int trackArr[] = new int[arr.length];
         for(int i=0;i<arr.length;i++){
            trackArr[i]=0;
         }
      
        int p = 0;
        for(int i = 0; i<size; i++){
              int count = 1;
            for(int j = i+1; j<size; j++){
               if(trackArr[j]==0){
                 if(arr[i] == arr[j]){
                    trackArr[j]=-1;
                      count++;
                }
               }
            }
             if(count > 1){
           p++;
        }
        }

       

        System.out.println("Number of elements occurring more than once: "+p);
        }




    }

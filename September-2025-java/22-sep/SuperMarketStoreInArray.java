import java.util.Scanner;

public class SuperMarketStoreInArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] =  new int[input];
        for(int i = 0; i<input; i++){
            arr[i] = sc.nextInt();
        }
        int selectItem = sc.nextInt();
        findItem(arr,selectItem);

    }

    public static void findItem(int arr[], int selectItem){
        int count= 0;
		
        for(int i = 0; i<arr.length; i++){
            if(selectItem == arr[i]){
                count++;
            }
            
        }

        
		
			if(count > 0){
			System.out.println("Item code "+selectItem+" was sold "+count+" times.");
              
            }else{
				 System.out.println("Item code "+selectItem+" was not sold today.");
					System.exit(0);
			}

    }
}
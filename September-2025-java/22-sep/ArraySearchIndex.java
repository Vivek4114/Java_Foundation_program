import java.util.Scanner;

public class ArraySearchIndex{

public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	int arr[] = new int[input];
	
	for(int i = 0; i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	
	int item = sc.nextInt();
	searchItem(arr,item);
	
	
}

public static void searchItem(int arr[], int item){
    int count = 0;
    int index = 0;

	for(int i = 0; i<arr.length; i++){
        index++;
		if(arr[i] == item){
			count++;
			break;

		}
	}

    if(count == 1){
        System.out.println("Number found at index "+index-1+".");
		 
    }
    else{
        System.out.println("Number not found in array.");
    }
	
}
	
}
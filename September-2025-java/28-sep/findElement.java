import java.util.Scanner;

public class findElement{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size " );
	int size = sc.nextInt();
	if(size <= 0){
	System.out.println("Size is invalid..!, Enter The Positive Interger Number ");
	System.exit(0);
	}	
	int arr[] = new int[size];

	System.out.println("Enter the Array Element");
	for(int i = 0; i< arr.length; i++){
	arr[i] = sc.nextInt();
	}	
	System.out.println("Enter the Key Value Element ");
	int key = sc.nextInt();
	int count = 0;
	for(int i = 0 ; i< arr.length; i++){
		if(key == arr[i]){

		count++;
		System.out.println("The Array Element Found int the "+ i + " index or Postion " +  (i + 1));
		}
		}
	
	if(count == 0){
		System.out.println(key + " Element not found int the array");
	}
	}
}

	
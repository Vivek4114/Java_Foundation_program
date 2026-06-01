import java.util.Scanner;
class UnderstandArray{

	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many want to print in array");
	int n = sc.nextInt();
	int arr[n] = {};
	
	for(int i = 0; i<arr.length; i++){
	
		arr[i] = sc.nextInt();
	}

	for(int i = 0; i<arr.length; i++){
	
		System.out.println(arr[i]+" ");
	}
	}
}

	
import java.util.Scanner;

public class TestArray1{
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	int arr1[] = new int[5];
	int arr2[] = new int[5];

	for(int i = 0; i<arr1.length; i++){
		arr1[i] = sc.nextInt();
	}

	for(int i = 0; i<arr1.length; i++){
		arr2[i] = sc.nextInt();
	}

	 int arr3[] = new int[arr1.length + arr2.length];
		int index = 0;
	/*
	for(int i=0; i<arr1.length ; i++){
			arr3[index++] = arr1[i]; 
	}
	for(int i=0; i<arr2.length ; i++){
			arr3[index++] = arr2[i]; 
	}
	*/
	
	for(int i=0; i<arr1.length ; i++){
		arr3[index++] = arr1[i];
		arr3[index++] = arr2[i]; 
	}
	
	for(int i=0; i<arr3.length ; i++){
	System.out.print(arr3[i]+" ");
	}
}
}
		
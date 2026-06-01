// write a program a key and display whether it is present in the array or not by useing linear search techinieque. 
// if the element is present then display how many time it is present in the array where it ispresent

import java.util.Scanner;

public class DisplayArrayPosition{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40, 10,50,30,40,10, 40,30};

		System.out.println("Enter the key to find in array : ");
		int key = sc.nextInt();
		int count = 0;
		boolean isPresent = false;
		int position = 0;
		for(int i = 0; i< arr.length; i++){
			if(arr[i] == key){
				isPresent = true;
				position = i + 1;
				System.out.println("Postion : "+position);
				count++;
			}
		}

		if(isPresent == true){
		System.out.println("the Element "+ key +" found in " + count + " Time , Position : "+ position );
		}
		else{
			System.out.println("The Element is Not found in the array " );
		}
	}
}

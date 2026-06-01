public class SeperateEvenOddElement{
	public static void main(String [] args){

	int arr[] = {1,2,3,4,5,6,7,8,6,1,4,5,6,9,6,4,2,1,3,3,3,3,3,3,3,3,5,5,5,5,5,5,5,6,6,7,7,8,8,9,9,6,7,6,5,9,5,10};

	
	
	int OddCount= 0;
	int evenCount = 0;
	
	
	for(int i = 0; i< arr.length; i++){
		if(arr[i] %2 == 0){
		 evenCount++;
		}
		else{
		 OddCount++;
		}
	}
	
	int []evenArr = new int[evenCount];
	int []oddArr = new int[OddCount];
	int evenIndex  = 0;
	int oddIndex = 0;

	for(int i = 0; i< arr.length; i++){
		if(arr[i] %2 == 0){
		evenArr[evenIndex++] = arr[i];
		}
		else{
		oddArr[oddIndex++] = arr[i];
		}
	}
	
	System.out.print("Even Array :   ");
	for(int i : evenArr){
		System.out.print(i + " ");
	}
	System.out.println();
	System.out.print("Odd Array :   ");
	for(int i : oddArr){
		System.out.print(i + " ");
	}
	System.out.println();
}

}
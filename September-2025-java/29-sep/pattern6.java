/*
Q6 . Write the program in Java to display the following pattern:
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
*/

public class pattern6{
	
	public static void main(String [] args){
		
		for(int row = 1; row<=5; row++){
			int index = 1;
			for(int col = 5; col >= row ; col--){
				System.out.print(index + " ");
				index +=2;
			}
			System.out.println();
		}
	}
}
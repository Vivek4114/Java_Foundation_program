/*
Q5 . Write a program in Java to display the following pattern:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

public class Pattern5{
	
	public static void main(String [] args){
		
		for(int row = 1; row<=5; row++){
			for(int col = 5; col >= row ; col--){
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
/*
Q3 . Write the program in Java to display the following pattern:
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/

public class Pattern3{
	
	public static void main(String [] args){
		
		for(int row = 1; row <= 5; row++){
			for(int col = row; col >= 1; col--){
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
/*
Q2 . Write a program in Java to display the following pattern:
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1

*/

public class ReverseRightAngleTrianglePattern{
	
	public static void main(String [] args){
		
		for(int row = 5; row >=1 ; row--){
			for(int col = row; col >= 1; col--){
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
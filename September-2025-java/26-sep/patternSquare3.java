 

//write a program to display to following pattern.
/*

1 1 1 1 1 
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/

public class  patternSquare3{
	public static void main(String [] args){

		for(int row = 1; row <=5; row++)
		{
			for(int col = 1; col<=5; col++){
				System.out.print(row+" ");
			}
		System.out.println();
		}
}
}
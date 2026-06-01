public class  patternSquare6{
	
	public static void main(String [] args){
			int index = 5;
		for(int row = 1; row <= 4; row++)
		{	
			for(int col = 1; col<=5; col++){
			
				System.out.print(index+"    ");
				index= index + 5;
			}
			System.out.println();
		}
}
}
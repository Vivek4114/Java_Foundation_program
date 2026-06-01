import java.util.Scanner;
class  ReactangleWithBetweenSpace{

	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number how many line Star you want to print");
	int num = sc.nextInt();

	for(int row = 1;  row<=num ; row++){
		for(int col = 1; col<=num; col++){
			if(row ==1 || row ==  num ||  col == 1 ||col == num  ){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
}
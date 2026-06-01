import java.util.Scanner;
public class DivisionException{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		
		int res = 0;
		
		try{
			res = num1/num2;
		}
		catch(Exception e){
			System.err.println(" Warning.!! Don't divide number with Zero");
		}
		
		System.out.println("Result is : " + res);
		
	}
}
		
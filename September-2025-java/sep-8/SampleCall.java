import java.util.Scanner;
class Sample{
	 private int a ;

	 private int b;
	static Scanner sc = new Scanner(System.in);

	public void setValue(){
		System.out.println("Enter the value of a : " );
		this.a = sc.nextInt();

		System.out.println("Enter the value of a : " );
		this.b = sc.nextInt();
		
		}


	public int getA(){
 		return a;
		}

	public int getB(){
		return b;
		}
}

public class SampleCall{

	public static void main(String [] args){

		Sample s = new Sample();
		s.setValue();
		System.out.println(s.getA());
		System.out.println(s.getB());
		}

	}

	
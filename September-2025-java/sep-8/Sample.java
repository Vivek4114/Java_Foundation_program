import java.util.Scanner;
class Sample{
	private int a ;
	private int b;

	public void setValue(){
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextInt();
		this.b = sc.nextInt();
		}


	public int getA(){
			return a;
		}
	public int getB(){
			return b;
		}
	}
		
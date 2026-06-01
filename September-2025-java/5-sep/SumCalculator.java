import java.util.Scanner;

class SumCalculator{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter your Number : ");
int a = sc.nextInt();

System.out.println("Enter your Second Number  : ");
int b = sc.nextInt(); 
int result = findSum(a,b);
System.out.println("sum of " +a + " and " + b + " is " + result);
}

public static int findSum(int a, int b){

return a+b;
}

}
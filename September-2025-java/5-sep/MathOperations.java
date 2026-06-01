import java.util.Scanner;

class MathOperations {
    public static void main(String [] args){
        MathOperations m1 = new MathOperations();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        m1.multiply(a,b);
        m1.MathOperations();

    }

    public static void add(int a, int b){
        System.out.println("Sum = "+(a+b));
    }

    public void multiply(int a, int b){
         System.out.println("Product = "+(a*b));
    }

    public void MathOperations(){
        System.out.println("Math Operations Ready!");
    }
}
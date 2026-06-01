import java.util.Scanner;
class SolutionPrime {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    boolean t = isPalindrome(x);
    System.out.println(t);
}

static boolean isPalindrome(int x) {
         if(x < 0){
			 return false;
		 }
		int rev = 0;
        int temp = x;
        while(temp!=0){
            int div = temp%10;
            rev = rev * 10 + div;
            temp/=10;
        }

        if(rev == x){
            return true;
        }
        else{
            return false;
        }

    }
}
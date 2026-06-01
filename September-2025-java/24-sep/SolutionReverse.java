import java.util.Scanner;
class SolutionReverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SolutionReverse s = new SolutionReverse();
        long reverse = s.reverse(n);
        System.out.println(reverse);
    }

    public long reverse(int x) {
        long rev = 0;
        long temp = x;

        while(temp != 0){
            rev = rev * 10 + temp % 10;
            temp/=10;
        }

        return rev;

    }
}
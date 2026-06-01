class PalindromeInRange{
    public static void main(String [] args){
        checkPalindrome(100,200);
    }

    public static void checkPalindrome(int num1, int num2){
        
        System.out.println("Palindrome numbers between "+num1 + " and "+ num2 + " are:");
        for(int i = num1; i<= num2 ; i++){
                    int temp = i;
                    int rev = 0;
               
                while(temp !=0){
                    int rem = temp%10;
                     rev = rev * 10 + rem;
                    temp/=10;
                }

                if(rev == i){
                    System.out.print(" "+i);
                }
        }


    }
}
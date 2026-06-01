// 25. Check for Magic Number

// Aim: A number is magic if the recursive sum of digits becomes 1.

// Example: 1729 → 1+7+2+9=19 → 1+9=10 → 1+0 = 1 → Magic


class MagicNumber{
    public static void main(String args[]){
        
        checkMagic(1729);
        
    }
    
    public static void checkMagic(int num){
        int temp = num;
        int sum = 0;

        while(temp!=0){
            int rem = temp%10;
            sum = sum +  rem;
            temp /=10;

            if( temp == 0 && sum > 9){
            temp = sum;
            sum = 0;
            
        }
            
        }
        

        System.out.println(sum);

        


        if(sum == 1){
            System.out.println("Magic number ");
        }
        else{
            System.out.println("Not Magic number ");
        }
        
    }
}
class Smith{
    public static void main(String args[]){
        checkSmith(666);
    }
    public static boolean isPrime(int num)
    {
        int isPrime = 0;
        for(int i = 1; i<= num ;i++){
            
                if(num%i == 0){
                     isPrime++;
                }
                }
            
           
            if(isPrime == 2 )
            return true;
            return false;

    }
    public static void checkSmith(int num){
        
         int pow = 1; int sum2 = 0;
         
        int temp = num;
        int temp2 = num;
        int temp3 = num;
        
        int sum = 0;
        while(temp !=0){
            sum += temp%10;
            temp/=10;
        }
        
        System.out.println(sum);
    int i=2;
        while(i<=temp2)
        {
            if(isPrime(i) && temp2%i==0)
            {
                int t=i;
                while(t !=0){
            sum2+= t%10;
            t/=10;
        }
        
               
                System.out.println(i);
                temp2=temp2/i;
                i=1;
            }
            i++;
            
        }
        System.out.println(sum2);
        if(sum2==sum)
        System.out.println("Smith number");
        else
        System.out.println("not a smith number");




        
        // for(int i = 1; i< temp2 ;i++){
        //     int isPrime = 0;
        //     for(int count = 1; count <= i; count++){
                
        //         if(i % count == 0){
        //              isPrime++;
        //         }
                
        //     }
            
           
        //     if(isPrime == 2  && num%i == 0){
        //        pow *= i;
        //        sum2 += i;  
        //     }    
        // }
        
        //   System.out.println();
        //     int findLast = num / pow;
        //     System.out.println(findLast);
        //         sum2 += findLast;
                
        //         System.out.println(sum2);
                
                
           
             
         
}
}
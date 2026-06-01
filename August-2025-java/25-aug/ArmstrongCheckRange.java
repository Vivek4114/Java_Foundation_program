class ArmstrongCheckRange{
    public static void main(String args[]){
        checkArmstrong(100000000);
    }

    public static void checkArmstrong(int num){
        int t = num;
         
         
        for(int c = 1; c<=t; c++){
        
        int ctemp = c;
        int ctemp2 = c;
        int count = 0;


            while(ctemp != 0){
                count++;
                ctemp/=10;
             }

             int sum = 0;

                while(ctemp2 !=0 ){
                  int rem = ctemp2 % 10;
                    int pow =1;

                    for(int i = 1; i<=count; i++){
                        pow *= rem;
                     }

                    sum += pow;
                    ctemp2 /=10;


            }
        
             if(sum == c){
                System.out.print(" "+ sum);
            }
        
        
    }
       
            // if(sum == num){
            //   System.out.println("Armstrong"); 
            // }
            // else{
            //     System.out.println("Not Armstrong");
            // }

    }
}
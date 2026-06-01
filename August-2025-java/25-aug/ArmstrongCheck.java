class ArmstrongCheck{
    public static void main(String args[]){
        checkArmstrong(153);
    }

    public static void checkArmstrong(int num){

        int temp = num;
        int temp2 = num;
        int count = 0;


        while(temp != 0){

            count++;
            temp/=10;

        }

        int sum = 0;

        while(temp2 !=0 ){
                  int rem = temp2 % 10;
                    int pow =1;

                for(int i = 1; i<=count; i++){
                     pow *= rem;

                }

                sum += pow;

                 
            temp2 /=10;


        }

            if(sum == num){
               System.out.println("Armstrong"); 
            }
            else{
                System.out.println("Not Armstrong");
            }

    }
}
class PrimeInRange{
    public static void main(String args[]){
            checkPrime(10,20);
    }

    public static void checkPrime(int num1, int num2){
        

        for(int i = num1; i<= num2; i++){
                int isPrime = 0;
                int temp = i;
                 
                 for(int div = 1; div <= temp; div++){

                        if(temp % div == 0){
                            isPrime++;
                        }


                 }

                 if( isPrime == 2){
                    System.out.print(" " + i);
                 }
        }

    


    }
}
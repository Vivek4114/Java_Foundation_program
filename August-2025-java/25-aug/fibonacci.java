class FibonacciSeries{
    public static void main(String [] args){
        printFibonacci(5);
    }

    public static void printFibonacci(int num){

         int a = 0;
        int b = 1;
          int c =0;
           
        int i = 1;
        while(i <= num){
           
            System.out.print(" "+ c);
            c=a+b;  
            b=a;
            a=c;                      
             i++;
        }
         
        
    }
}
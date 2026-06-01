import java.util.Scanner;

public class StockMarketApp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double prices[]  = new double[5];
        for(int i = 0;i<prices.length; i++){
            prices[i] = sc.nextDouble();
        }
		
		//[100.0, 98.0, 92.0, 95.0, 89.0]

        detectPriceDrops(prices);

    }

    public static void detectPriceDrops(double[] prices) {
        
        for(int i = 1; i<prices.length; i++){
           double previous = prices[i - 1];
           double current = prices[i];1
           double dropPercent = ((previous - current) / previous) * 100;
           if((previous-current)> 5 ){
            System.out.println("Day : "+i+" drop > 5%");
           }
        }
    }
}
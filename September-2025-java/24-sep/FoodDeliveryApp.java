import java.util.Scanner;

public class FoodDeliveryApp
{
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        int  currentOrders [] = new int[4];

        for(int i = 0; i<currentOrders.length; i++){
            currentOrders[i] = sc.nextInt();
        }

        int newOrderId  = sc.nextInt();

        
        int res[] = updateOrderQueue(currentOrders , newOrderId );

         for(int i = 0; i<res.length; i++){
                 System.out.print(res[i]+" ");
            }
    }

        public static int[] updateOrderQueue(int[] currentOrders, int newOrderId) {
            
            for(int i = 1 ; i<currentOrders.length; i++){
                
                    currentOrders [i-1] = currentOrders[i];
                 
            }
			
			currentOrders[currentOrders.length - 1] = newOrderId;

            
			
			 return currentOrders;
            
        }


    }

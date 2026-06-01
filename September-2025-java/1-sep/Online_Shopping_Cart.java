import java.util.Scanner;

public class Online_Shopping_Cart{
    
	
    public static void main(String [] args){
        Shopping s1 = new Shopping();
		Shopping s2 = new Shopping();
		
        Scanner sc = new Scanner(System.in);
       int noOfItem = sc.nextInt();

        for(int i = 1; i<=noOfItem; i++){

            s1.addItem(sc.nextDouble());
			
        }
		
		int noOfItem2 = sc.nextInt();
		
		for(int i = 1; i<= noOfItem2; i++){
			
			s2.addItem(sc.nextDouble());
			
		}
		
        s1.checkOut();
		s2.checkOut();
 
    }
}

class Shopping{
	
    
    double price;
    double totalPrice = 0;

    
  
    public void addItem(double price){
		this.price=price;
        
          this.totalPrice += this.price;
       
    }

    public void checkOut(){
    
        System.out.println("Total Amount to be Payed : "+ this.totalPrice);

    }

}
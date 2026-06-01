 

class ShoppingMall{
public static void main(String args[]){

	 double Price = 23332, Discount , TotalBill;

	if(Price >=30000){

	 Discount = Price * 0.20;
	TotalBill = Price - Discount;

	}
else{

TotalBill = Price;
}

	

	System.out.println("Total bill " + TotalBill);
}
}
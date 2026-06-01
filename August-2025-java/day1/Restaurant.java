class Restaurant{
	public static void placeOrder(String item,double Qty, double price, long mobileNo){
		System.out.println("Your Dish Is : " + item);
		System.out.println("Quantity of Items : " + Qty);
		System.out.println("Price of Item : " + price);
		double billExcluedeGST = Qty * price;
		finalBill(billExcluedeGST,mobileNo);
		
	}
	
	public static void finalBill(double billExcluedeGST,long mobileNo )
	{
		double gst = 18.5;
		double amount = (billExcluedeGST * (gst/100))+billExcluedeGST;
		System.out.println("Total Amount to be Paid : " + amount );
		sendMessage(mobileNo,amount);
	}
	
	
	
	public static void sendMessage(long mobileNo, double amount){
		
		System.out.println("Hello " + mobileNo + " Hope you liked the food");
		System.out.println("Your amount to be Paid  with GST 18.5% : RS. "+ amount);
	}
	
	
	public static void main(String args[]){
		
		placeOrder("Biryani",2,1000,8010568459L);
	}
	
	
}
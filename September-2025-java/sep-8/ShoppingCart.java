/*
Question 3: Shopping Cart Discount Calculator

Create a ShoppingCart class (BLC Class)
Attributes:
itemPrice (private, double)
quantity (private, int)
discountPercentage (private, double)

Methods:
Setters & Getters for all attributes.
calculateTotalPrice() Method:
Formula: total = itemPrice * quantity
Return Type: double

calculateDiscountedPrice() Method:
Formula: discountedPrice = total
(total * discountPercentage / 100)
Return Type: double
Tester Class:
Test Case 1:
Input: itemPrice = 500, quantity = 2, discount = 10%
Expected Output: Total Price = 1000

Test Case 2:
Input: same as above
Expected Output: Discounted Price = 900
*/


class ShoppingCart{

	private double itemPrice ;
	private double quantity ;
	private double discountPercentage;
	
	public void setItemPrice( double itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public void setQuantity( double quantity){
		this.quantity = quantity;
	}
	
	public void setDiscountPercentage( double discountPercentage){
		this.discountPercentage = discountPercentage;
	}
	
	
	
	
	
	public double getItemPrice(  ){
		System.out.print("Item Price : ");
		return itemPrice;
	}
	
	public double getQuantity( ){
		
		System.out.print(" Quantity : ");
		 return quantity;
	}
	
	public double getDiscountPercentage(){
		
		System.out.print("Item Discount Percentage : ");
		return discountPercentage;
	}
	
	public double calculateTotalPrice(){
		double total = itemPrice * quantity;
		System.out.print("Total is : ");
		return total;
	}
	
	public double calculateDiscountedPrice(){
		double total = calculateTotalPrice();
		double discountedPrice = total - (total * discountPercentage / 100);
		System.out.print(" Discounted Price is  : ");
		return discountedPrice;
	}
	
}
		
	
	
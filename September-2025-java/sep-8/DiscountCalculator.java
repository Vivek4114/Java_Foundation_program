import java.util.Scanner;

public class DiscountCalculator{
	
	public static void main(String [] args){
		ShoppingCart s1 = new ShoppingCart();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the item Price : ");
		double itemPrice = sc.nextDouble();
		
		System.out.print("Enter the Quantity : ");
		double quantity = sc.nextDouble();
		
		System.out.print("Enter the Discount Percentage (%):");
		double discountPercentage = sc.nextDouble();
		
		
		s1.setItemPrice(itemPrice);
		s1.setQuantity(quantity);
		s1.setDiscountPercentage(discountPercentage);
		
		System.out.println(s1.getItemPrice());
		System.out.println(s1.getQuantity());
		System.out.println(s1.getDiscountPercentage());
		
		System.out.println(s1.calculateTotalPrice());
		System.out.println(s1.calculateDiscountedPrice());
		
		
		
	}
	
}

	
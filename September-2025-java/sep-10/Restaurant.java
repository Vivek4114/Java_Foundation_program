import java.util.Scanner;

public class Restaurant{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
		FoodDelivery f1 = new FoodDelivery();
		System.out.println("Enter the Item name : " );
		String itemName = sc.nextLine();
		f1.setItemName(itemName);

		System.out.println("Enter the price of the item : ");
		double price = sc.nextDouble();
		f1.setPrice(price);
		sc.nextLine();
		System.out.println("Enter the Category of Item : ");
		String category = sc.nextLine();
		
		
		
		f1.setCategory(category);
		
		System.out.println(" Itme Name : "+ f1.getItemName());
		System.out.println(" price : " + f1.getPrice());
		System.out.println(" Category : " + f1.getCategory());
		
	}
}


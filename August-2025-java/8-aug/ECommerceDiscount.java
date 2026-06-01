import java.util.*;


class ECommerceDiscount{
public static void main(String args[]){

	double purchaseAmount,discountRate,finalPrice;

	System.out.println("Enter your Purchase Amount : ");
	Scanner sc = new Scanner(System.in);
	purchaseAmount = sc.nextInt();


	 discountRate = (purchaseAmount >2000 ) ?  (purchaseAmount *0.20) : (purchaseAmount*0.10);

	finalPrice = purchaseAmount - discountRate;

	System.out.println("Final Price: RS. " + finalPrice);
	}
}

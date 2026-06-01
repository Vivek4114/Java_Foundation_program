import java.util.*;

class DiscountCalculator{
		
public static void main(String args[]){

double cost,discount,finalAmount;

Scanner sc = new Scanner(System.in);
System.out.println("Enter your Cost");
cost = sc.nextInt();

if(cost<10000){
	discount = cost*0.05;
}
else if(cost >=10000 && cost <= 50000 ){
	discount = cost*0.15;
}
else if(cost >50000 && cost <= 80000){
	discount = cost * 0.25;
}
else {
	discount = cost* 0.35;
}

finalAmount = cost - discount;
System.out.println("Base Cost " + cost);
System.out.println("Discount Cost " + discount);
System.out.println("Final Cost " + finalAmount);
}
}




import java.util.*;


class ElectricityBill{
public static void main(String args[]){

	int units,rate;
	Scanner sc = new Scanner(System.in);
	units = sc.nextInt();


	int bill = (units >100 ) ?  (units*7) : (units*5);

	System.out.println("Total bill: Rs " + bill);
	}
}

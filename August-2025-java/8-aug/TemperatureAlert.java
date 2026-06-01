import java.util.*;


class TemperatureAlert{
public static void main(String args[]){

	int temperature ;
	Scanner sc = new Scanner(System.in);

	temperature = sc.nextInt();
	
	String Day = (temperature >=30)? "Hot Day" : " Pleasant Day" ;

	System.out.println(Day);

	}
}
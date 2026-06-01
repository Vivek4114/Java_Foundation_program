import java.util.*;


class SpeedMonitor{
public static void main(String args[]){

	int speed;
	Scanner sc = new Scanner(System.in);
	speed = sc.nextInt();


	String msg = (speed >= 100 ) ? "Over Speeding" : "safe Speed";

	System.out.println(msg);
	}
}

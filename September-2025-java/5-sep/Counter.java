/*
Static_vs_Instance_Variables
Program1: Static vs Instance Variables
Create a class Counter with:
	An instance variable count (int), initialized to 0.
	A static variable totalCount (int), initialized to 0.
	A method increaseCount() that increments count by 1 and also increments totalCount by 1 each time an object is created.
	A method showCounts() that prints both count and totalCount.
Task:
1.	Create 3 objects of Counter.
2. Call increaseCount() on each object.
2.	Call showCounts() on each object.
3.	Explain the difference in values between count and totalCount.
Expected Understanding:
	instance variable will be unique per object.
	static variable will be shared across all objects.

*/
import java.util.Scanner;
class Counter {
	
    int count=0;
    static int totalCount=0;

	public static void main(String [] args){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number : " );
		 int num = sc.nextInt();
		 
		  
		 
		 for(int i = 1; i<=num; i++){
			 
			 Counter c1 = new Counter();
			 c1.increaseCount();
			 c1.showCounts();
			 
		 }
	 
	}

    public void increaseCount(){
	this.count++;
	Counter.totalCount++;

    }

    public void showCounts(){
		System.out.println("Count is : " + this.count);
		System.out.println("totalCount is : "+Counter.totalCount);
		
	}
}
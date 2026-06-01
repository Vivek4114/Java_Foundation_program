/*factory Robot Assignment
A factory robot is programmed to perform tasks repeatedly. The number of tasks is
determined by factorial of a given input number.
Write a program to calculate the factorial of a number.
Class Name: RobotTask
Method Name: factorial(int number)
Return Type: void
Variable Suggestion: result*/

class RobotTask{
	
	public static void main(String args[]){
		
		
		factorial(4);
	}
	
	public static void factorial(int number){
		
		int flag = 1;
	 
		
		while(number != 0){
			 flag *=number;
			 number--;
		}
		
		System.out.println("factoraial is : " + flag);
		
	}
	
}

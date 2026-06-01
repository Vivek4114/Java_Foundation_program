import java.util.Scanner;

public class Gym{



	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		FitnessTracker f1 = new FitnessTracker();
		
		System.out.println("Enter the Daily Steps : ");
		int dailySteps = sc.nextInt();
		f1.setDailySteps(dailySteps);
		
		System.out.println("Enter the  Calories Burned : ");
		double caloriesBurned = sc.nextDouble();
		f1.setCaloriesBurned(caloriesBurned);
		
		System.out.println("Enter the Active Minutes: ");
		int activeMinutes = sc.nextInt();
		f1.setActiveMinutes(activeMinutes);
		
		System.out.println("Daily Steps : " +f1.getDailySteps());
		System.out.println(" Calories Burned : " + f1.getCaloriesBurned());
		System.out.println(" Active Minutes : " + f1.getActiveMinutes());
		
	}
	
}
		
		
		
		
		
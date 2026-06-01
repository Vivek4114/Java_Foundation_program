class FitnessTracker{

	private int dailySteps;
	private double caloriesBurned;
	private int activeMinutes;
	
	public void setDailySteps(int dailySteps){
		
		if(dailySteps > 0){
		this.dailySteps = dailySteps;
		}
		else{
			System.out.println(" Step can not be Negative ");
			System.exit(1);
		}
		
	}
	
	public void setCaloriesBurned(double caloriesBurned){
		if(caloriesBurned > 0){
		this.caloriesBurned = caloriesBurned;
		}
		else{
			System.out.println("Calories can not be Negative");
			System.exit(1);
		}
		
		
	}
	
	public void setActiveMinutes(int activeMinutes){
		if(activeMinutes > 0){
			
		this.activeMinutes = activeMinutes;
		}
		else{
			System.err.println("Minutes can not be Negative");
			System.exit(0);
		}
	}
	
	
	public int getDailySteps(){
		return dailySteps;
	}
	
	public double getCaloriesBurned(){
		return caloriesBurned;
	}
	
	public int getActiveMinutes(){
		return activeMinutes;
	}
	
}
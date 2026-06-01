/* 7. Sensor Data Processing
A function reads temperature data from a sensor. It also needs to remember the last reading to calculate the difference between the current and previous reading.
If the previous reading is declared as a local variable, what issue will occur?
How can a static variable solve this problem?  */

class SensorDataProcess{
	
	static double realTemp = 0;
	public static void main(String [] args){
		
		readData(34);
		readData(56);
	}
	
	public static void readData(double currentTemp){
		int temp2 = 0;
		realTemp = currentTemp;
		 temp2 = realTemp - currentTemp;
		 
			//realTemp = currentTemp;
			 
			
			//realTemp = realTemp - currentTemp;
			System.out.println("present Temperature is : " + temp2);
			
			
				
	}
	
}
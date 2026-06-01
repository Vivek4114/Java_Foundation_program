class LeapYearCheck{
	public static void main(String  [] args){
		int year = 1900;
		
		if(year % 4 ==0 && year % 100 != 0 || year % 400 ==0){
			System.out.println("leap year : " + year);
		}
		else{
			System.out.println("not leap year" + year);
		}
	}
}
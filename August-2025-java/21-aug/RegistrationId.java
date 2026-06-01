/*2. Student Registration IDs
Imagine a program where each new student gets a unique registration number automatically starting from 1000.
If you use a local variable, what problem will you face when generating IDs?
How can you use a static variable to ensure every student gets a unique ID without restarting from 1000 each time?*/



class RegistrationId{
	 static int RegId = 1000;
	public static void main(String args[]){
		StudentsId();
		StudentsId();
		StudentsId();
	
	}
	
	public static void StudentsId(){
		//int RegId = 1000;
		RegId++;
		System.out.println("Student id is : " + RegId);
		
		
	}
}
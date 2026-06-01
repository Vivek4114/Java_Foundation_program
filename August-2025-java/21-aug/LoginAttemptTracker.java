/* Login Attempt Tracker
A website limits login attempts to 3 tries.
If you implement the login() function with a local counter, will the restriction work? Why or why not?
How can a static variable help implement this feature correctly?
*/



class LoginAttemptTracker{
	static int loginAttempt = 0;
	
	public static void main(String args[]){
		
		for(int count = 1; count<=4; count++){
			login();
		}
		
		if(loginAttempt <=3){
			System.out.println("Login Success Full " );
			
		}
		else{
			System.out.println("Login Failed ");
		}
		
		
	}
	
	public static void login(){
		loginAttempt++;
	}
}

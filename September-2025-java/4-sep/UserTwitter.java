import java.util.Scanner;

class Twitter{
	
	
	static String platName = "Twitter";
	String userId ;
	String userName;
	int followersCount=0;
	 
	
	public void setDetails(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user Name " );
		String userName = sc.nextLine();
		this.userName = userName;
		
		System.out.println("Enter the user id " );
		String userId = sc.nextLine();
		this.userId = userId;
				
		
		
	}
	
	public void PostTweet(String message){
	 
		System.out.println(message);
		System.out.println("Post Twitted on Twitter is : " +  message);
		
	}
	
	public void followUser(String follower){
		
		this.followersCount++;
		System.out.println(" name : " + follower + " the one Follower are added  on  Twitter");
		
	}
	
	public void displayUserInfo(){
		//this.followersCount = follower;
		System.out.println("User Details ");
		System.out.println("Platform  : " +  Twitter.platName);
		System.out.println("User Id : " + this.userId);
		System.out.println("User Name : " + this.userName);
		System.out.println("Follower : " + this.followersCount);
		
	}
	
	
	
	/*
	public String toString()
	{
		displayUserInfo();
		
	return "";	
	}
	
	*/
	
}

public class UserTwitter
{
	
	public static void main(String [] args){
	 			
		 
		
				
		Twitter t1 = new Twitter();
		t1.setDetails();	
		t1.PostTweet("post 1 Twitted ");
		t1.displayUserInfo();
		
		Twitter t2 = new Twitter();
		
		t2.setDetails();
		t2.PostTweet("post 2 Twitted ");
		
		t1.followUser("Ramesh");
		t2.displayUserInfo();
		
		t1.displayUserInfo();
		
		 	
			 
		
			 
			
			 
		
	}
}
	
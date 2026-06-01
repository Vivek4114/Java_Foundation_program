/* Hierarchical Inheritance Example 1: Social Media User Types
Scenario:
A social media application has different types of users. All users share some common
profile information, but users like Influencer and RegularUser have additional features
specific to their roles. Use hierarchical inheritance to design this system.

Requirements:
Create a base class: User

Create two subclasses: Influencer, RegularUser

Class: User
Instance variables: username, email
Method: displayUserInfo() to print basic profile info

Class: Influencer (extends User)
Instance variables: followerCount, sponsorshipStatus
Method: displayInfluencerInfo()
Prints its own info
Accesses inherited variables
Calls displayUserInfo()

Class: RegularUser (extends User)
Instance variables: postCount, friendsCount
Method: displayRegularUserInfo()
Prints its own info
Accesses inherited variables
Calls displayUserInfo()

Main class:
Create objects of both Influencer and RegularUser
Call their respective display methods

Test Case (Hardcoded):
Influencer:  
  Username: "angel_priya"  
  Email: "queen123@social.com"  
  Follower Count: 50000  
  Sponsorship Status: "Active"

RegularUser:  
  Username: "merchant_of_bay"  
  Email: "mob@example.com"  
  Post Count: 150  
  Friends Count: 320  
Expected Output:
Influencer Details:
Username: angel_priya  
Email: queen123@social.com  
Followers: 50000  
Sponsorship: Active

Regular User Details:
Username: merchant_of_bay  
Email: mob@example.com  
Posts: 150  
Friends: 320  
  */
 
 class User
 {
	 
	 String userName;
	 String email;
	 
	 User(String userName, String email){
		 this.userName = userName;
		 this.email = email ;
	 }
	 
	  public void displayUserInfo(){
		  System.out.println(" User Name : " + userName  );
		  System.out.println(" Email : " + email );
	  }
		
	 
 }
 
 class Influence extends User
 {
	 int followerCount;
	 String sponsorshipStatus;
	 
	 Influence(String userName, String email,int followerCount, String sponsorshipStatus ){
		 super(userName, email);
		 this.followerCount = followerCount;
		 this.sponsorshipStatus = sponsorshipStatus;
		 
		 
	 }
	 
	 
	 public void displayInfluencerInfo(){  
		 displayUserInfo();
	 System.out.println(" Follwer Count : " + followerCount );
	 System.out.println(" Sponsor Ship : " + sponsorshipStatus +"\n");
	 }
	 
 }
 
 class RegularUser extends User
 {
	int postCount;
	int friendsCount;
	
	RegularUser(String userName, String email,int postCount, int friendsCount){ 
		 super(userName, email);
		 this.postCount= postCount;
		this.friendsCount = friendsCount;
		
	}
		 
	 
	public void  displayRegularUserInfo(){
			displayUserInfo();
		 System.out.println(" Post Count : " + postCount );
		 System.out.println(" Friends Count : " +  friendsCount + "\n");
	 }
 }  

class  SocialMedia
{
	public static void main(String[] args) 
	{
		Influence influence1 = new Influence("Dabba-Fellow", "dabbafellow123@gmail.com", 500000, "Active");
		RegularUser regularUser1  = new  RegularUser("Munna-Bhai", "munnabhai4242@gmail.com", 19, 320 );
		influence1.displayInfluencerInfo();
		regularUser1.displayRegularUserInfo();
		 
	}
}

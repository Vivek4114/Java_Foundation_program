import java.util.Scanner;

public class Instagram{
	
	public static void main(String [] args){
		
		
		
		InstagramUser i = new InstagramUser();
		
		i.SetDetails();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Story Content : ");
		String content = s.nextLine();
		
		i.uploadeStory(content);	
		i.addFollower();
		i.addFollower();
		i.addFollower();
		i.addFollower();
		i.displayProfile();
		
		
		
		InstagramUser i2 = new InstagramUser();
		
		i2.SetDetails();
		
		 
		System.out.println("Enter the Story Content : ");
		String content1 = s.nextLine();
		
		i2.uploadeStory(content1);
		
		i2.addFollower();
		i2.addFollower();
		i2.addFollower();
		i2.addFollower();
		i2.addFollower();
		i2.addFollower();
		i2.addFollower();
		i2.displayProfile();
		
		
		
		
		
		
		
		
	}
	
}

class InstagramUser
{
	String userId, userName;
	int followerCount;
	static String platform = " Instagram ";
	
	public void SetDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the User Name : ");
		this.userName = sc.nextLine();
		
		System.out.print("Enter the User Id : ");
		this.userId = sc.nextLine();
		
		
	}
	
	public void uploadeStory(String storyContent){
		
		System.out.println(this.userName +" is " + storyContent + " is uploaded on your Story ");
		
	}
	
	public void addFollower(){
		this.followerCount++;
		
	}
	
	public void displayProfile(){
		
		System.out.println("Platform is " + InstagramUser.platform);
		System.out.println("User Id : " + this.userId);
		System.out.println("user Name : " +this.userName);
		System.out.println("follower is : " + this.followerCount);
		
	}
}
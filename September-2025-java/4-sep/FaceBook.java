import java.util.Scanner;

public class FaceBook{
	public static void main(String [] args){
		
		FBUser f1 = new FBUser();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your UserName: ");
		f1.userName = sc.nextLine();
		
		System.out.println("Enter Your User Id: ");
		f1.userId = sc.nextLine();
		f1.addFriend("Bhavesh");
		f1.createPost(" Life is Happy ");
		f1.displayInfo(); 
		
		System.out.println();
		FBUser f2 = new FBUser();
		System.out.println("Enter Your UserName: ");
		f2.userName = sc.nextLine();
		 System.out.println("Enter Your User Id: ");
		f2.userId = sc.nextLine();
		 f2.createPost("Good Morning");
		 f2.addFriend("Ramesh");
		 f2.displayInfo();
		
	 }
	}


class FBUser{
	String userId, userName;
	int friendCount;
	static String platform = "Face Book ";
	
	public void addFriend(String userName){
		
		this.friendCount++;
		System.out.println(userName + " is added on your Friend List "+ this.userName);
		
	}
	
	public void createPost(String Messeage){
		 
		System.out.println(Messeage + " is posting on your Profile "+this.userName);
	}
	
	public void displayInfo(){
		System.out.println("\n Platform is " + FBUser.platform);
		System.out.println("User Name " + this.userName);
		System.out.println("User Id " + this.userId);
		System.out.println("friendsCount " + this.friendCount);
		
		
	}
	
	
	
}
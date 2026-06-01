import java.util.Scanner;
public class Pubg{

	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		
		pubgUser p1 = new pubgUser();
		p1.setDetails();
		
		System.out.println("Enter your EnemyName : ");
		String enemyName = s.nextLine();
		
		System.out.println("Enter the value of Damage : ");
		int damage = s.nextInt();
		
		
		
		p1.attackPlayer(enemyName, damage );
		
		p1.addKill();
		p1.addKill();
		p1.addKill();
		
		p1.displayState();
		
		
		
		pubgUser p2 = new pubgUser();
		p2.setDetails();
		s.nextLine();
		System.out.println("Enter your EnemyName : ");
		String enemyName1 = s.nextLine();
		
		System.out.println("Enter the value of Damage : ");
		int damage1 = s.nextInt();
		
		p2.attackPlayer(enemyName1, damage1 );
		p2.addKill();
		p2.addKill();
		 
		p2.displayState();
		
	}
	
}


class pubgUser
{
	String playId, PlayerName;
	int kill;
	double health = 100;
	static String platform = "PUBG";
	
	public void setDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter your Player Id : " );	
		this.playId = sc.nextLine();
		 
		System.out.print("Enter your Player Name : " );	
		this.PlayerName = sc.nextLine(); 	
	}
		
	
	
	public void attackPlayer(String enemyName, int damage){
		this.health = this.health - damage;
		System.out.println("I Killed " + enemyName + " Damage : " + damage);
		
	}
	
	public void addKill(){
		this.kill++;
		
	}
	
	public void displayState(){
		System.out.println("\n Game Name :" + pubgUser.platform );
		System.out.println("Player Id : " + this.playId);
		System.out.println("Player Name : " + this.PlayerName);
		System.out.println("health : " + this.health);
		System.out.println("Kill : " + this.kill);
		
		
	}
}
	
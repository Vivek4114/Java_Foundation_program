import java.util.Scanner;

class Naukari {
    String userName;
    Profile profile;
    
    // Default constructor
    public Naukari() {}
    
    // Parameterized constructor
    Naukari(String userName, Profile profile) {
        this.userName = userName;
        this.profile = profile;
    }
    
    public void setDetails(Scanner sc) {
        System.out.println("Enter the User Name");
        this.userName = sc.nextLine();
        
        this.profile = new Profile();
        profile.setProfileDetails(sc);
    } 
    
    public String displayDetails() {
        return " User Name : " + userName +
                "\n Candidate Name : " + profile.candidateName +
                "\n Email Id : " + profile.emailId +
                "\n Date Of Birth : " + profile.dob +
                "\n Mobile No : " + profile.mobileNo +
                "\n Qualification : " + profile.qualification +
                "\n Skill : " + profile.skill + 
                "\n Year of Experience :" + profile.yeo +
                "\n---------------------------------------" +
                "\n Address : \n Street Name : " + profile.address.streetName +
                "\n State : " + profile.address.state + 
                "\n Country : " + profile.address.country;
    }
}

class Profile {
    String candidateName;
    long mobileNo;
    int yeo;
    String emailId;
    String dob;
    String qualification;
    String skill;
    Address address;
    
    // Default constructor
    public Profile() {}
    
    // Parameterized constructor
    Profile(String candidateName, long mobileNo, int yeo, String emailId, String dob, String qualification, String skill, Address address) {
        this.candidateName = candidateName;
        this.mobileNo = mobileNo;
        this.yeo = yeo;
        this.emailId = emailId;
        this.dob = dob;
        this.qualification = qualification;
        this.skill = skill;
        this.address = address;
    }
    
    public void setProfileDetails(Scanner sc) {
        System.out.println("Enter the Candidate Name: ");
        this.candidateName = sc.nextLine();
        
        System.out.println("Enter the Mobile No: ");
        this.mobileNo = sc.nextLong();
        sc.nextLine(); // Consume newline
        
        System.out.println("Enter the year of Experience: ");
        this.yeo = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Email Id: ");
        this.emailId = sc.nextLine();
        
        System.out.println("Enter the Date Of Birth: ");
        this.dob = sc.nextLine();
        
        System.out.println("Enter the Qualification: ");
        this.qualification = sc.nextLine();
        
        System.out.println("Enter the Skill Set: ");
        this.skill = sc.nextLine();
        
        this.address = new Address();
        address.setAddressDetails(sc);
    }
}

class Address {
    String streetName;
    String state;
    String country;
    
    // Default constructor
    public Address() {}
    
    // Parameterized constructor
    Address(String streetName, String state, String country) {
        this.streetName = streetName;
        this.state = state;
        this.country = country;
    }
    
    public void setAddressDetails(Scanner sc) {
        System.out.println("Enter the Street Name: ");
        this.streetName = sc.nextLine();
        
        System.out.println("Enter the State Name: ");
        this.state = sc.nextLine();
        
        System.out.println("Enter the Country: ");
        this.country = sc.nextLine();
    }
}

public class NaukariMain {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Naukari n1 = new Naukari();
        n1.setDetails(sc);
        System.out.println(n1.displayDetails());
    }
}
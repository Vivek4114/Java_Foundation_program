import java.util.Scanner;
public class SingleThreadBankApp {
private static double balance = 0;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("\n=== Banking System ===");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter amount to deposit: ");
double deposit = sc.nextDouble();
balance += deposit;
System.out.println("Deposited: ?" + deposit);

break;
case 2:
System.out.print("Enter amount to withdraw: ");
double withdraw = sc.nextDouble();
if (withdraw <= balance) {
balance -= withdraw;
System.out.println("Withdrawn: ?" + withdraw);
} else {
System.out.println("Insufficient balance.");
}
break;
case 3:
System.out.println("Current Balance: ?" + balance);
break;
case 4:
System.out.println("Exiting... Thank you!");
System.exit(0);
default:
System.out.println("Invalid choice. Try again.");
}
}
}
}
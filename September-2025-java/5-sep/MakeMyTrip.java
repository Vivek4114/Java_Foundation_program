import java.util.Scanner;

public class MakeMyTrip {
    public static void main(String[] args) {
		
        MakeMytripUser m1 = new MakeMytripUser();

        m1.setDetails();
		
		
        m1.calculateTotalCost(12.0);
        m1.showRecommendedDestination();
        MakeMytripUser.applyServiceFee(7000);
        m1.printBookingReceipt();
    }
}

class MakeMytripUser {
    static double serviceFeeRate = 0.1;

    String hotelName;
    int nights;
    double pricePerNight;

    static Scanner sc = new Scanner(System.in);

    public void setDetails() {
        System.out.print("Enter the Hotel Name: ");
        this.hotelName = sc.nextLine();

        System.out.print("Enter the number of nights: ");
        this.nights = sc.nextInt();

        System.out.print("Enter the Price per Night: ");
        this.pricePerNight = sc.nextDouble();
    }

    public void calculateTotalCost(double discountPercent) {
        double totalBeforeDiscount = nights * pricePerNight;
        double discountAmount = totalBeforeDiscount * (discountPercent / 100.0);
        double amountAfterDiscount = totalBeforeDiscount - discountAmount;
        double totalCost = amountAfterDiscount + (amountAfterDiscount * serviceFeeRate);

        System.out.println("--- Booking Cost Details ---");
        System.out.println("Total Before Discount: Rs." + totalBeforeDiscount);
        System.out.println("Discount (" + discountPercent + "%): " + discountAmount);
        System.out.println("Amount After Discount: Rs." + amountAfterDiscount);
        System.out.println("Final Total with Service Fee: Rs" + totalCost);
    }

    public void showRecommendedDestination() {
        System.out.println("--- Recommended Destinations ---");
        System.out.println("1. Bali");
        System.out.println("2. Manali");
        System.out.println("3. Shimla");
        System.out.println("4. Mahabaleshwar");
    }

    public static void applyServiceFee(double amount) {
        double total = amount + (amount * serviceFeeRate);
        System.out.println("Total after applying service fee on Rs." + amount + ": Rs." + total);
    }

    public void printBookingReceipt() {
        System.out.println("--- Booking Receipt ---");
        System.out.println("Hotel Name      : " + hotelName);
        System.out.println("Nights Booked   : " + nights);
        System.out.println("Price per Night : Rs." + pricePerNight);
    }
}



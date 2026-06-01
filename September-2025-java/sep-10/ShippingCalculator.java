import java.util.Scanner;

public class ShippingCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double packageWeight = sc.nextDouble();
        int shippingDistance = sc.nextInt();
        Package p = new Package();
		p.setShippingDistance(shippingDistance);
		p.setPackageWeight(packageWeight);

        ShippingFee.calculateFee(p);
    }
}

class Package {

    private double packageWeight;
    private int shippingDistance;
    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public void setShippingDistance(int shippingDistance) {
        this.shippingDistance = shippingDistance;
    }

    public double getPackageWeight() {
        return packageWeight;
    }
	
	 
    public int getShippingDistance() {
        return shippingDistance;
    }

    public void displayPackageDetails() {
        System.out.println("Package Weight : " + packageWeight);
        System.out.println("Shipping Distace : " + shippingDistance);

    }
}

class ShippingFee {
      double feeAmount;
	
	
    public  static String calculateFee(Package pkg) {
		
           if (pkg.packageWeight <= 5) {
			
            if (pkg.shippingDistance <= 100) {
                feeAmount = 5;
            } else if (pkg.shippingDistance > 100) {
                feeAmount = 10;
            } else {
                feeAmount = 0;
            }
        } else if (pkg.packageWeight > 5 && pkg.packageWeight <= 20) {
            if (pkg.shippingDistance <= 100 && pkg.shippingDistance > 0) {
                feeAmount = 10;
            } else if (pkg.shippingDistance > 100) {
                feeAmount = 20;
            } else {
                feeAmount = 0;
            }
        } else if (pkg.packageWeight > 20 ) {
            if (pkg.shippingDistance <= 100) {
                feeAmount = 20;
            } else if (pkg.shippingDistance > 100) {
                feeAmount = 40;
            } else {
                feeAmount = 0;
            }
        
        } else if (pkg.packageWeight <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Error ");

        }

       return " " +feeAmount;
        } 
    } 
	
	
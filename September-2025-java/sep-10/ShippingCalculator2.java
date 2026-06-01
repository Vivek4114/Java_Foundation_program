import java.util.Scanner;

public class ShippingCalculator2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double packageWeight = sc.nextDouble();
        int shippingDistance = sc.nextInt();

        if (packageWeight <= 0) {
            System.out.println("Invalid weight");
            return; 
        }

        Package p = new Package();
        p.setShippingDistance(shippingDistance);
        p.setPackageWeight(packageWeight);

        p.displayPackageDetails();  
        String result = ShippingFee.calculateFee(p);  
        System.out.println("Shipping Fee: " + result);
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
        System.out.println("Package Weight: " + packageWeight);
        System.out.println("Shipping Distance: " + shippingDistance);
    }
}

class ShippingFee {
   
        return String.valueOf(feeAmount);
    }
}

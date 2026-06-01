import java.util.Scanner;

public class MobileShopie{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        String customerName = sc.next();
        double mobilePrice = sc.nextDouble();
        MobilePurchase m1 = new MobilePurchase(customerName, mobilePrice);
        System.out.println(m1.displayDetails());


    }
}

class MobilePurchase {
    String customerName;
    double mobilePrice;
    double discount;
    double finalPrice;

    MobilePurchase(String customerName, double mobilePrice){
        this.customerName = customerName;
        this.mobilePrice = mobilePrice;
    }

    public double getDiscount(){
        double gst = 18.0;

        if(mobilePrice <= 20000){
            discount = (mobilePrice * 10/100.0);
            return discount;
            
        }
        else if(mobilePrice >20000 && mobilePrice <= 40000){
            discount = (mobilePrice * 15/100.0);
                return discount;
        }  
            else if(mobilePrice >40000 && mobilePrice <=70000){
                discount = (mobilePrice * 22/100.0);
                return discount;
            }
            else{
                discount = (mobilePrice * 28/100.0);
                return discount;
            }

            

        }

        public double getFinalPrice(){
            double dis = getDiscount();

            finalPrice = (mobilePrice- dis) + ((mobilePrice-dis) * 18/100.0);
            return finalPrice;
        }

        public String displayDetails(){
            double dis = getDiscount();
            double finalAmount = getFinalPrice();

             System.out.println("---- Mobile Store Bill ----");
return "Customer Name: "+customerName+
"\nOriginal Price: Rs."+mobilePrice+
"\nDiscount: Rs."+dis+
"\nPrice After Discount: Rs."+(mobilePrice - dis)+
"\nGST (18%): Rs."+((mobilePrice-dis) * 18/100.0)+
"\nFinal Amount Payable: Rs."+finalAmount;
        }

    }

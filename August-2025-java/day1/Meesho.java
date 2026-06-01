/*
Product_Inventory_Management
Scenario 2: Meesho  Product Inventory Management
Objective:
Allow sellers to list and manage product stock.
Question:
Create a class Product.
Use a parameterized constructor to initialize:
productId (String)
productName (String)
price (double)

Method addStock(int quantity):
Adds quantity to inventory
Overload addStock():
Version 1: Accepts quantity
Version 2: Accepts quantity and isPromotional (boolean)

Validations:
price > 0
quantity must be > 0

If promotional stock, print a special message

Sample Output:
Product: Kanchipuram Saree
Price: 1200.00
Stock added: 10 units
Promotional Stock: 5 units added

Sample Input
ZP4567
KanchipuramSaree
1200
10
5 true
Sample Output
Stock added: 10 units
Promotional Stock: 5 units added
*/

import java.util.Scanner;

public class Meesho{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
  
        String productId = sc.next();
              String productName = sc.next();
              double price = sc.nextDouble();
              int quantity = sc.nextInt();
              int quantity2 = sc.nextInt();
              boolean isPromotional = sc.nextBoolean();
         
            Product p1 = new Product(productId, productName, price);
             p1.addStock(quantity);
             p1.addStock(quantity2, isPromotional);

    }
}

class Product{
    String productId ;
    String productName;
    double price;

    Product(String productId, String productName, double price  ){
        if(price > 0){
            this.price = price;
            this.productId = productId;
            this.productName = productName;
        }
        else{
            System.out.println("Price Must be greter than 0 ");
            System.exit(0);
        }
    }

   int addStock(int quantity){
        if(quantity > 0){
            System.out.println("Stock added: "+quantity+" units");
            return quantity;
        }
        else{
            System.out.println("Quantity must be greter than 0");
              System.exit(0);
            return 0;
          
        }
    }

    int addStock(int quantity, boolean isPromotional ){
        if(quantity > 0 && isPromotional == true){
            System.out.println("Promotional addStock: "+quantity+" units added");
            return quantity;
        }
        else{
            System.out.println("you are not eligible for Promotion ");
            return 0;
        }

    }

    
}
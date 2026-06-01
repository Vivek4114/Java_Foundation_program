/*
import java.util.Scanner;
public class FoodDeliveryApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
       
      Order o1 = new Order();
      DeliveryService d1 = new DeliveryService();
        int OrderId = sc.nextInt();
        String foodItem = sc.next();
        double price = sc.nextDouble();
        o1.setOrderId(OrderId);
        o1.setFoodItem(foodItem);
        o1.setprice(price);
        d1.processOrder(o1);
        System.out.println(o1.displayOrder());
		o1.markAsDelivered();
    }

}

class Order{
    private int orderId;
    private String foodItem;
    private double price;
    private boolean delivered = false;

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public void setFoodItem(String foodItem){
        this.foodItem = foodItem;
    }

    public void setprice(double price){
        if(price > 0){
         this.price = price;
        }
        else{
            System.err.println("kindly provide correct value");
            System.exit(0);
        }
    }
 
    public int getOrderId(){
        return orderId;
    }

    public String getFoodItem(){
        return foodItem;
    }

    public double getPrice(){
        return price;
    }

    

    public void markAsDelivered() {
    this.delivered = true;
    System.out.println("Order marked as Delivered");
      }

    public String displayOrder(){ 
		  return "Order ID:" + orderId +", Item: "+foodItem+ ", Price: "+price +"Delivered : "  markAsDelivered() ;
	   } 
}


class DeliveryService{

    double deliveryCharge;

    public void processOrder(Order o){

    if( o.getPrice() > 0){
        System.out.println("Processing Order "+o.getPrice()+" for "+ o.getFoodItem());
        System.out.println("Delivery charge of ?50 applied");
      
    }
    else{
      System.out.println("Processing Order"+o.getPrice()+" for "+ o.getFoodItem());
        System.out.println("Delivery charge of 0 applied");
    }

    }
} 
*/


import java.util.Scanner;
public class FoodDeliveryApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
       
      Order o1 = new Order();
      DeliveryService d1 = new DeliveryService();
        int OrderId = sc.nextInt();
        String foodItem = sc.next();
        double price = sc.nextDouble();
        o1.setOrderId(OrderId);
        o1.setFoodItem(foodItem);
        o1.setprice(price);
        d1.processOrder(o1);
        System.out.println(o1.displayOrder());
		o1.markAsDelivered();
    }

}

class Order{
    private int orderId;
    private String foodItem;
    private double price;
    private boolean delivered = false;

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public void setFoodItem(String foodItem){
        this.foodItem = foodItem;
    }

    public void setprice(double price){
        if(price > 0){
         this.price = price;
        }
        else{
            System.err.println("kindly provide correct value");
            System.exit(0);
        }
    }
 
    public int getOrderId(){
        return orderId;
    }

    public String getFoodItem(){
        return foodItem;
    }

    public double getPrice(){
        return price;
    }

    

    public void markAsDelivered() {
    this.delivered = true;
    System.out.println("Order marked as Delivered");
      }

    public String displayOrder(){ 
		  return "Order ID:" + orderId +", Item: "+foodItem+ ", Price: " +price ;
	   } 
}


class DeliveryService{

    double deliveryCharge;

    public void processOrder(Order o){

    if( o.getPrice() > 0){
        System.out.println("Processing Order "+o.getOrderId()+" for "+ o.getFoodItem());
        System.out.println("Delivery charge of Rs.50 applied");
      
    }
    else{
      System.out.println("Processing Order"+o.getPrice()+" for "+ o.getFoodItem());
        System.out.println("Delivery charge of 0 applied");
    }

    }
} 
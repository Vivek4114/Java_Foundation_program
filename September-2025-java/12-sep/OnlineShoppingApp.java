import java.util.Scanner;

public class OnlineShoppingApp{
static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        Product p1 = new Product();
        ShoppingCart c1 = new ShoppingCart();

        String name = sc.next();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        int qty = sc.nextInt();
        p1.setName(name);
        p1.setPrice(price);
        p1.setQuantity(quantity);

        c1.addToCart(p1,qty);
        

    }
}

class Product{
    private String name;
    private double price;
    private int quantity;

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    } 

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
 
    public int getQuantity(){
        return quantity;
        
    }

    public String displayProduct(){
        return "Product: "+name +
                ", Price: "+price +
                ", Quantity: "+quantity;
    }
 
}

class ShoppingCart{

    public void addToCart(Product p, int qty){
        System.out.println(qty+" "+p.getName() +"(s) added to cart");
        System.out.println("Product: "+ p.getName()+", Price: "+p.getPrice() + ", Stock: "+(p.getQuantity() - qty));
    }
}



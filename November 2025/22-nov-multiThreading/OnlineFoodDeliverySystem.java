class OrderTaking extends Thread {
public void run() {
System.out.println("OrderTaking: Receiving orders...");
try {
Thread.sleep(2000); // simulate time taken to take orders
} catch (InterruptedException e) {
System.out.println("OrderTaking Interrupted");
}
System.out.println("OrderTaking: Orders received.");
}
}
class PaymentProcessing extends Thread {
public void run() {
System.out.println("PaymentProcessing: Processing payments...");

try {
Thread.sleep(3000); // simulate payment time
} catch (InterruptedException e) {
System.out.println("PaymentProcessing Interrupted");
}
System.out.println("PaymentProcessing: Payments completed.");
}
}
class DeliveryTracking extends Thread {
public void run() {
System.out.println("DeliveryTracking: Updating delivery status...");
try {
Thread.sleep(4000); // simulate time taken to track
} catch (InterruptedException e) {
System.out.println("DeliveryTracking Interrupted");
}
System.out.println("DeliveryTracking: Order delivered.");
}
}
public class OnlineFoodDeliverySystem {
public static void main(String[] args) {
OrderTaking orderThread = new OrderTaking();
PaymentProcessing paymentThread = new PaymentProcessing();
DeliveryTracking deliveryThread = new DeliveryTracking();
orderThread.start();
paymentThread.start();
deliveryThread.start();
}
}
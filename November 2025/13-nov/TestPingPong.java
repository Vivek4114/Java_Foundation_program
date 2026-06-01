class PingPong {
    private boolean pingTurn = true; // flag to track whose turn it is
    public synchronized void printPing() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            while (!pingTurn) {
                wait(); // wait until it's Ping's turn
            }
            System.out.println("Ping");
            pingTurn = false; // switch turn to Pong
            notify(); // wake up Pong thread
            Thread.sleep(1000); // pause for visibility
        }
    }
    public synchronized void printPong() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            while (pingTurn) {
                wait(); // wait until it's Pong's turn
            }
            System.out.println("Pong");
            pingTurn = true; // switch turn to Ping
            notify(); // wake up Ping thread
            Thread.sleep(500); // pause for visibility
        }
    }
}

public class TestPingPong {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        Thread pingThread = new Thread(() -> {
            try {
                pingPong.printPing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread pongThread = new Thread(() -> {
            try {
                pingPong.printPong();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        pingThread.start();
        pongThread.start();
    }
}
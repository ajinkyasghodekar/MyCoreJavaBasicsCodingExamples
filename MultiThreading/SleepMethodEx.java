package MultiThreading;

public class SleepMethodEx extends Thread{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            System.out.println("I am lazy thread");
            Thread.sleep(5000);
        }
    }
}

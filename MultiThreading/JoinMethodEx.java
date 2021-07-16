package MultiThreading;

class MyTh extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside child method...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception caused...");    
            }
        }
    }
}
class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyTh m = new MyTh();
        m.start();
        m.join(10000);
        for (int i = 0; i < 10; i++) {
            System.out.println("inside parent method...");
        }
    }
}
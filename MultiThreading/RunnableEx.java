package MultiThreading;

class MyRunnableEx implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside run method of runnable");            
        }
    }
}

public class RunnableEx {
    public static void main(String[] args) {
        MyRunnableEx mr = new MyRunnableEx();
        Thread t = new Thread(mr);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside main method");            
        }
    }
    
}

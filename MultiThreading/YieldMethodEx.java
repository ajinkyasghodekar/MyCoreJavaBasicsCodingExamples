package MultiThreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am in child method...");
            Thread.yield();
        }
    }
}

class Testt{
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("I am in main method...");
        }
    }
}

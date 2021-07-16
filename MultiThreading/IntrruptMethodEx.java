package MultiThreading;

class IntrruptMethodEx extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Im in child thread...");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Intrrupted by main thread.");
        }
    }   
}

class Test2{
    public static void main(String[] args) {
        IntrruptMethodEx im = new IntrruptMethodEx();
        im.start();
        im.interrupt();
        System.out.println("Main thread intrrupted child.");
    }
}
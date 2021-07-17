package MultiThreading;

class MultiThreadingEx extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("-----Child-----");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Exception at sleep method.");
            }
        }
    }    
}

class Parent{
    public static void main(String[] args) {
        MultiThreadingEx mt = new MultiThreadingEx();
        mt.start();
        System.out.println(Thread.currentThread().getName()); 
        System.out.println(mt.getPriority());
        mt.setPriority(10);
        System.out.println(mt.getPriority());
        mt.interrupt();
        for (int i = 0; i < 10; i++) {
            System.out.println("-----Main-----");
        }
    }
}

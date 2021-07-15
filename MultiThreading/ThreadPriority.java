package MultiThreading;

class ThreadPriority extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Insind run method of thread priority");
        }
    }
}

class PriorityTest{
    public static void main(String[] args) {
        System.out.println("The priority of main thread is: "+Thread.currentThread().getPriority());
        ThreadPriority tp = new ThreadPriority();
        tp.setPriority(10);
        System.out.println("The priority of child thread is: "+tp.getPriority());
        tp.start(); 
        for (int i = 0; i < 10; i++) {
            System.out.println("Insind main method of thread priority");
        }
    }
}

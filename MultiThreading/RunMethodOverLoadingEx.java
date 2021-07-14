package MultiThreading;

class ChildClass extends Thread{
    public void run() {
        System.out.println("Inside child run method (new thread).");
    }
    public void run(int i) {
        System.out.println(i);
        System.out.println("Inside overloaded method of run.");
    }
}

public class RunMethodOverLoadingEx {
    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
        ch.start();
        ch.run(10);
    }
    
}

package MultiThreading;
class Child extends Thread {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread...");
        }
    }
}

class Test{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.start();
        for (int i=0; i<10; i++) {
            System.out.println("Main Thread...");
        }
    }
}
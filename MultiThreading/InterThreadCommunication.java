package MultiThreading;

class Parentp extends Thread {
    int total;
    public void run() {
        synchronized(this){
            for(int i=0; i<=100; i++){
                total=total+i;
            }
            System.out.println("Child thread gives notification.");
            this.notify();
        }  
    }
}

class Childc{
    public static void main(String[] args) throws InterruptedException {
        Parentp pp = new Parentp();
        pp.start();
        synchronized(pp){
            System.out.println("Main thread trying to call wait()");
            pp.wait(2000);
            System.out.println("Main thread get notification.");
            System.out.println(pp.total);
        }
    }
}
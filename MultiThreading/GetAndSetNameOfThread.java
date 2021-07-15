package MultiThreading;

class GetAndSetNameOfThread extends Thread{
    
}

class ThreadName{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ajinka Demo Thread...");
        System.out.println(Thread.currentThread().getName());
    }
}

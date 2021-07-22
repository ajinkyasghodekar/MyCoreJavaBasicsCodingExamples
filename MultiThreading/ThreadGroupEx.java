package MultiThreading;

class ThreadDemo extends Thread{

}
class ThreadGroupEx extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup());
        Thread.currentThread().setPriority(9);
        ThreadDemo td = new ThreadDemo();
        td.getThreadGroup();
        td.setPriority(4);
        System.out.println(td.getPriority());
    }
}

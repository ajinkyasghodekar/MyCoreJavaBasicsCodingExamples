package MultiThreading;

class DaemonThreadEx extends Thread{

}

class ParentDeamon{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        // Setting main thread to Daemon is not possible becouse its by default non-daemon. 
        //Thread.currentThread().setDaemon(true);
        DaemonThreadEx dt = new DaemonThreadEx();
        System.out.println(dt.isDaemon());
        dt.setDaemon(true);
        System.out.println(dt.isDaemon());
    }
}

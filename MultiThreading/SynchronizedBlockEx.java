package MultiThreading;

// If there ar lakh of LOC and only 2 to 3 lines are need of synchronized keyword then we go for synchronized block.
class DispBlk{
    public void dispNum() {

        // Consider here 1 lakh of LOC
        ;;;;;;;;;;;;;;;;;;;;;;;;
        // And only for loop code is in need of synchronization
        /* In synchronized block we can use
         * - this 
        */ 
        synchronized(this){
            for(int i=0; i<10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception Occured in ...!!!");
                }
            }
        }
        
        // Consider here 1 lakh of LOC
        ;;;;;;;;;;;;;;;;;;;;;;;;
    }

    public synchronized void dispChar() {
        for(int i=65; i<75; i++){
            System.out.println((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occured in ...!!!");
            }
        }
    }
}

class MythreadBlkEx1 extends Thread{
    DispBlk d;
    MythreadBlkEx1(DispBlk d){
        this.d=d;
    }
    public void run() {
        d.dispChar();
    }
}

class MythreadBlkEx2 extends Thread{
    DispBlk d;
    MythreadBlkEx2(DispBlk d){
        this.d=d;
    }
    public void run() {
        d.dispNum();
    }
}

class TestBlkT{
    public static void main(String[] args) {
        DispBlk d1 = new DispBlk();
        MythreadBlkEx1 mt1 = new MythreadBlkEx1(d1);
        MythreadBlkEx2 mt2 = new MythreadBlkEx2(d1);
        mt1.start();
        mt2.start();
       
    }
}
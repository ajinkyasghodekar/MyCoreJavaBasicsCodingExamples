package MultiThreading;

/* See output without synchronized keyword its irregular output 
*  So to avoid this we use synchronized keyword to get systamatic output
*/
class Disp{
    public synchronized void dispNum() {
        for(int i=0; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occured in ...!!!");
            }
        }
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

class MythreadEx1 extends Thread{
    Disp d;
    MythreadEx1(Disp d){
        this.d=d;
    }
    public void run() {
        d.dispChar();
    }
}

class MythreadEx2 extends Thread{
    Disp d;
    MythreadEx2(Disp d){
        this.d=d;
    }
    public void run() {
        d.dispNum();
    }
}

class TestT{
    public static void main(String[] args) {
        Disp d1 = new Disp();
        MythreadEx1 mt1 = new MythreadEx1(d1);
        MythreadEx2 mt2 = new MythreadEx2(d1);
        mt1.start();
        mt2.start();
       
    }
}
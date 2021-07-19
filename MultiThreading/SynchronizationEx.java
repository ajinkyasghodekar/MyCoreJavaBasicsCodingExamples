package MultiThreading;

class Temporary {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println(" Good Morning "+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}

class OurThread extends Thread{
    Temporary tp; // HAS-A
    String name;
    OurThread(Temporary tp, String name){
        this.name = name;
        this.tp = tp;
    }
    public void run() {
        tp.wish(name);
    }
}

class MainCl{
    public static void main(String[] args) {
        Temporary tp = new Temporary();
        OurThread ot1 = new OurThread(tp, "Dhoni");
        OurThread ot2 = new OurThread(tp, "Virat");

        ot1.start();
        ot2.start();
    }
}
package AbstractEx;

abstract class P {
    abstract void m1();
}
class C extends P{
    public void m1() {
        System.out.println("Implementation of abstract method...");
    }
}
package OopsConcepts.Abstraction.UsingAbstract;

abstract class AbstractEx {
    public abstract void m1();
    
    public void temp() {
        System.out.println("Method temp in abstract class...");
    }
}

class Sub extends AbstractEx{
    public void m1() {
        System.out.println("Implementation of abstract method m1()");
    }
}
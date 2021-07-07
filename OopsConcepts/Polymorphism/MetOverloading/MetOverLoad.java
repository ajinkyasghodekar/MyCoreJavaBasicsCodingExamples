package OopsConcepts.Polymorphism.MetOverloading;

public class MetOverLoad {
    public void m1() {
        System.out.println("No arg method...");
    }
    
    public void m1(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void m1(float f, double d) {
        System.out.println(f);
        System.out.println(d);
    }
}

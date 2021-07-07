package AccessModifier.Protected;

public class ProtectedEg {
    protected void m1() {
        System.out.println("In m1 protected method...");
    }
}

class Sub extends ProtectedEg {
    protected void m2() {
        System.out.println("In m2 protected method...");
    }
}

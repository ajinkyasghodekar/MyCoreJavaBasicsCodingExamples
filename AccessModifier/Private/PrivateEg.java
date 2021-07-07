package AccessModifier.Private;

public class PrivateEg {
    private void m1() {
        System.out.println("Inside m1 method...");
    }
    public static void main(String[] args) {
        PrivateEg privateEg = new PrivateEg();
        privateEg.m1();           // m1() is accessible here becouse its private and can be accessible in this class only.
    }
}

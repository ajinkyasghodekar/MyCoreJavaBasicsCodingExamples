package AccessModifier.Protected;

public class MainApp {
    public static void main(String[] args) {
        ProtectedEg protectedEg = new ProtectedEg();
        protectedEg.m1();

        Sub sub = new Sub();
        sub.m2();
    }
}

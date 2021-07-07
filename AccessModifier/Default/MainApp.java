package AccessModifier.Default;
import AccessModifier.Public.PublicEg;

public class MainApp {
    public static void main(String[] args) {
        DefaultEx defaultEg = new DefaultEx();
        PublicEg publicEg = new PublicEg();
        publicEg.m1();
        defaultEg.m1();
        sub sub = new sub();
        sub.m2();
    }
}

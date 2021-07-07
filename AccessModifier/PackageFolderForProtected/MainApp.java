package AccessModifier.PackageFolderForProtected;
import AccessModifier.Protected.ProtectedEg;

class Sub extends ProtectedEg {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.m1();

        //sub.m2(); not accepted becouse only parent protected methods can be accessible.
    }
}

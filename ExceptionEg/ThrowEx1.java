
public class ThrowEx1 {
    public static void m1() throws ArithmeticException{
        System.out.println("Hello we are in m1()");
        System.out.println(10/0);
        throw new ArithmeticException("Divide by zero...");
    }
    public static void main(String[] args) {
        ThrowEx1 throwEx = new ThrowEx1();
        try {
            throwEx.m1();
            System.out.println("Divide by zero...");
        } catch (Exception e) {
        }

    }
}

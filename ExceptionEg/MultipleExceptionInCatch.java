public class MultipleExceptionInCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException | NullPointerException e)
        {
            System.out.println("Divide by zero...");
        }
    }
}

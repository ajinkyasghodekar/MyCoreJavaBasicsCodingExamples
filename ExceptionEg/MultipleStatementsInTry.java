
public class MultipleStatementsInTry {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println(10/0);
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("5");
        }
        finally{
            System.out.println("6");
        }
        System.out.println("7");
    }
}

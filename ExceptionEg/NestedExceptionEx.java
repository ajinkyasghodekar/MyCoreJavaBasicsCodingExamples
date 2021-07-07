
public class NestedExceptionEx {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            try {
                System.out.println("2");
                System.out.println(10/0);
            } catch (Exception e) {
                System.out.println("3");
            }
            finally{
                System.out.println("4");
            }
            System.out.println("5");
        } catch (Exception e) {
            System.out.println("6");
        }
        finally{
            System.out.println("7");
        }
        System.out.println("8");
    }
}

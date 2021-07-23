package LogicBasedExample;

public class SwappingUsing2Var {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a is:" +a);
        System.out.println("Value of b is:" +b);

    }
}

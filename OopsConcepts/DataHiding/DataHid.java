package OopsConcepts.DataHiding;

public class DataHid {
    private static int num1 = 10;
    private static int num2 = 20;
    private static int total;

    private void met1() {
        System.out.println("In private method 1...");
        total = num1 + num2;
        System.out.println(total);
    }

    public static void main(String[] args) {
        DataHid dataHid = new DataHid();
        dataHid.met1(); 
        System.out.println("The addition of "+num1 +" and "+num2 +" is: "+total);
    }
}
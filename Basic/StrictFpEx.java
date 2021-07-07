package Basic;

class Sp{

    public strictfp void m1() {
        int x = 10;
        double y = 3;
        System.out.println(x/y);
    }
    public static strictfp void main(String[] args) {
        int a = 10;
        double b = 3;
        System.out.println(a/b);

        Sp sp = new Sp();
        sp.m1();
    }
}
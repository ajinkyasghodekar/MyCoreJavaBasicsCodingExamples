package AccessModifier.Public;

class MainApp{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        PublicEg publicEg = new PublicEg();
        publicEg.m1();
        System.out.println(a);
        System.out.println(b);
    }
}
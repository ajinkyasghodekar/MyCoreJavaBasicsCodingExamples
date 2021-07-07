package Basic;

class VarAcessibility {
    int a = 10;
    static int b = 20; 
    final int c = 30;

    // If below method is static then only static variables are accisible in m1()
    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {
        VarAcessibility varAcessibility = new VarAcessibility();
        varAcessibility.m1();
    }    
}
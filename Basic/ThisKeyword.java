package Basic;

class ThisKeyword {
    int a = 10;
    int b = 20;
    int c = 30; 

    public void m1() {
        a = this.a;
        b = this.b;
        c = this.c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.m1();
    }
}

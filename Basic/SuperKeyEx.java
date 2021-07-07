package Basic;

class Parent{
    int a = 100;
    int b = 200;
}

class Child extends Parent{
    public void m1() {
        System.out.println(super.a);
        System.out.println(super.b);
    }
}

class Child1 extends Child{
    public void name() {
        System.out.println(super.a);
        System.out.println(super.b);
    }
}

class Test{
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        Child1 c1 = new Child1();
        c1.name();
    }
}

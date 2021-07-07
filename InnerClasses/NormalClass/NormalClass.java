package InnerClasses.NormalClass;

class Outer {
    static int a = 10;
    static int b = 20; 
    int c = 30;

    class Inner{

        public void m1() {
            System.out.println("Inside inner class...");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } 
        
        Inner(){
            System.out.println("This is inner class constructor...");
        }
    }
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.m1();
        
        Outer.Inner i1 = new Outer().new Inner();
        i1.m1();
    }
}
package InnerClasses.MethodLocal;

class Outer {
    public void m1() {
        class Inner {
            public void m1(int a, int b) {
                int sum = a + b;
                System.out.println("The sum of " +a +" and "+b+" is: "+sum);
            }    
        }
        Inner inner = new Inner();
        inner.m1(10, 20);
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1(); 
    }
}
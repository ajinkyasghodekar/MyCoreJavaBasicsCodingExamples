package InnerClasses.StaticNested;

class outer{
    static class Inner{
        public void m1() {
            System.out.println("Inside static nested class...");
        }
    }
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.m1();
    }
}
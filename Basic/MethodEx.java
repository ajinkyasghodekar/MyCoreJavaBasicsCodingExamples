package Basic;

class MethodEx {
    public void m1() {
        System.out.println("In method m1() called by using refrence variable.");
    }
    public static void m2() {
        System.out.println("In method m2() called by using class name.");
    }
    public static void main(String[] args) {
        MethodEx methodEg = new MethodEx();
        System.out.println();
        methodEg.m1(); // Calling method by refrence variable.
        MethodEx.m2(); // Calling method by class name (But method must be static).
    }
}
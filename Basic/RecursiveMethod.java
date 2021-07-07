package Basic;

class RecursiveMethod{
    // Recursive Method Eg (Calling same method in itself leads to recursive calling of method => StackOverflow Error)
    public void m1() {
        System.out.println("Inside Recursive Method...");
        m1();
    }
    public static void main(String[] args) {
        RecursiveMethod recursiveMethod = new RecursiveMethod();
        recursiveMethod.m1(); //
    }
}
package Basic;

class parents{
    public void m1() {
        System.out.println("I am in m1 method...");
    }
    public static void m2() {
        System.out.println("I am in m2 static method...");
    }
}

// If method is static we can directly call it by className.methodName()
// If method is non static we have to call it by refrenceName.methodName()
class childs{
    public static void main(String[] args) {
        parents p = new parents();
        p.m1();
        parents.m2();
    }
}
package AccessModifier.Default;

class DefaultEx {
    public void m1() {
        System.out.println("In m1 method...");
    }
}

class sub extends DefaultEx{
    public void m2() {
        System.err.println("In m2 method...");
    }
}

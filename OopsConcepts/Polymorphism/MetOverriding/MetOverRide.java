package OopsConcepts.Polymorphism.MetOverriding;

class Parent {
    public void property() {
        System.out.println("Gold + Land + Shares...");
    }

    public void marry() {
        System.out.println("Abc");
    }
}

class Son extends Parent{
    public void marry() {
        System.out.println("Xyz");
    }
}

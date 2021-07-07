package OopsConcepts.Polymorphism.MetOverriding;

class MainApp {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.property();
        parent.marry();

        Son son = new Son();
        son.marry();

        Parent parent1 = new Son();
        parent1.property();
        parent1.marry();
        
    }
}

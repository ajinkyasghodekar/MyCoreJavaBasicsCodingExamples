package OopsConcepts.Polymorphism.MetOverloading;

public class MainApp {
    public static void main(String[] args) {
        MetOverLoad metOverLoad = new MetOverLoad();
        metOverLoad.m1();
        metOverLoad.m1(100, 200);
        metOverLoad.m1(300.33f, 400.02);
    }
}

package OopsConcepts.Abstraction.UsingInterface;

/*
    * Abstraction is nothing but hide actual code and just show implemetation.
    * use of interface id done here to call methods.
    * Can be implemented using abstract and interface concept.
*/
public class MainApp {
    public static void main(String[] args) {

        InterfaceEg interfaceEg = new AbstractionEg();
        interfaceEg.m1();
        interfaceEg.m2();
        interfaceEg.m3();
        interfaceEg.m4();
        interfaceEg.m5();
    }
}
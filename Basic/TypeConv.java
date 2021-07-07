package Basic;

class P{}
class C extends P{}

public class TypeConv{
    public static void main(String[] args) {
        // Type conversion (Implicit)
        int i = 10;
        long l = i;
        System.out.println(l);   

        // Type conversion / casting (Explicit)
        long l1 = 100;
        int i1 = (int) l1;
        System.out.println(i1);
        
        // Upcasting
        P p = new C();

        // Downcasting
        P p1 = new P();
        C c = (C) p1;
    }
} 


















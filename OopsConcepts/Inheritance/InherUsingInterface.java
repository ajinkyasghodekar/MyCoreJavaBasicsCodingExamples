package OopsConcepts.Inheritance;


interface Inter{
    public void m1();
}
interface Inter1{
    public void m2();
}
class InherUsingInterface implements Inter, Inter1{
    
    public void m1() {
        System.out.println("In m1 method of interface Inter");
    }
    public void m2() {
        System.out.println("In m1 method of interface Inter1");
    }
}

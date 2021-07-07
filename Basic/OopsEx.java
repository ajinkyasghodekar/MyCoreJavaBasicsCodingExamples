package Basic;

class child extends ParentP2{
    int i=100;
    public void m1() {
        System.out.println("Inside Parent P2 method....");
    }  
}

class ParentP2 {
    public child c1;


    public static void main(String[] args) {
        new ParentP2();
            child c = new child();
            c.m1();
    }
}
    

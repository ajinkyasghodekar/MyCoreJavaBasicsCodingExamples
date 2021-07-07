package InnerClasses.AnonymousClass;

class Outer{
    public void display() {
        System.out.println("In display method of outer class...");
    }
}

class Temp{
    public static void main(String[] args) {
        Outer outer = new Outer(){
            public void display() {
                System.out.println("In Anonymous Inner Class...");
            }
        };
        outer.display();

        Outer outer1 = new Outer();
        outer1.display();
    }
}
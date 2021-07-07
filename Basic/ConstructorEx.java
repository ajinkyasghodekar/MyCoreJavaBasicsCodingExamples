package Basic;

class ConstructorEx {
    public ConstructorEx(){
        System.out.println("Non-parameterized constructor");
    }
    public ConstructorEx(int a, int b){
        System.out.println("Parameterized constructor");
        System.out.println(a);
        System.out.println(b);
    }    

    public static void main(String[] args) {
        ConstructorEx constructorEg = new ConstructorEx();
        ConstructorEx constructorEg1 = new ConstructorEx(10,20);
    }
}

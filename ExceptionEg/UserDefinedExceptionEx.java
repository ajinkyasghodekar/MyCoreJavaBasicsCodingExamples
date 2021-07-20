class MyExcep1 extends RuntimeException{
    MyExcep1(String msg){
        System.out.println("This is user defined exception 1");
    }
}

class MyExcep2 extends RuntimeException{
    MyExcep2(String msg){
        System.out.println("This is user defined exception 2");
    }
}

class MyExcep3 extends RuntimeException{
    MyExcep3(String msg){
        System.out.println("This is user defined exception 3");
    }
}

class TestExcep{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);    
        } catch (Exception e) {
            throw new MyExcep1("Divide by zero exception");
        } 

    }
}
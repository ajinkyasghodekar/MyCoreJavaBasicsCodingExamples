package ObjectOperation;

class ToStringEx {
    public void m1(){
        System.out.println("Hello");
    }    

    @Override
    public String toString() {
        return "ToStringEg []";
    }

    public static void main(String[] args) {
        ToStringEx tt = new ToStringEx();
        tt.m1();
        System.out.println();
        System.out.println(tt);
    }
}
    // Before adding toString() 
    // O/p: Hello
    //      ObjectOperation.ToStringEg@4517d9a3
//---------------------------------------------------
    // After adding toString() 
    // O/p: Hello
    //      ToStringEg [] 
package Basic;

class GetAndSet {
    
    private String s1, s2;
    private int i1, i2;

    public String getS1() {
        return s1;
    }
    public void setS1(String s1) {
        this.s1 = s1;
    }
    public String getS2() {
        return s2;
    }
    public void setS2(String s2) {
        this.s2 = s2;
    }
    public int getI1() {
        return i1;
    }
    public void setI1(int i1) {
        this.i1 = i1;
    }
    public int getI2() {
        return i2;
    }
    public void setI2(int i2) {
        this.i2 = i2;
    }    
}

class Test1{
    public static void main(String[] args) {
        GetAndSet getAndSet = new GetAndSet();
        getAndSet.setI1(10);
        System.out.println(getAndSet.getI1());
        getAndSet.setS1("Hello I am Ajinkya...");
        System.out.println(getAndSet.getS1()); 
    }
}

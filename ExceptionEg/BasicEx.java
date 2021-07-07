class BasicEx {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
            System.out.println("Inside try block...");
        } catch (ArithmeticException e) {
            System.out.println("Please change denominator (b) other than zero...");
        }
    }
    
}

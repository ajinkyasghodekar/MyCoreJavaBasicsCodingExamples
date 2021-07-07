package WrapperClassEx;

class AutoBoxAndAutoUnbox {
    public static void main(String[] args) {
        // 1. Auto Boxing (Primitive to Wrapper)...
        int a = 100;
        Integer it =Integer.valueOf(a);
        Integer ab = a;
        System.out.println(ab);

        // 2. Auto UnBoxing (Wrapper to Primitive)...
        Integer un =new Integer(200);
        int i = un;
        System.out.println(i);
    }
}

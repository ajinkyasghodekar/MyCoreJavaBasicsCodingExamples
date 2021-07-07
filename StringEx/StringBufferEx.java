package StringEx;

class StringBufferEx{
    public static void main(String[] args) {
   
        // here Hello Word is o/p bcoz StringBuffer is mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Word");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer();

        // capacity()
        sb1.append("abcdefghijklmnop");
        System.out.println(sb1.capacity());

        System.out.println(sb.append(655));
        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
        System.out.println(sb.insert(4, "sdf"));
        System.out.println(sb.delete(2, 3));
        System.out.println(sb.reverse());
    }
}
package StringEx;

class MethodChaining {
    public static void main(String[] args) {
        // MethodChaining can be performed on all 3 String, StringBuffer, StringBuilder.
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.reverse().append("ajinkya").delete(0, 6).append("abcde");
        System.out.println(sb);
        
    }
}

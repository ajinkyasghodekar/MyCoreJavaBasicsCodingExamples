package StringEx;

class StringEx{
    public static void main(String[] args) {

        // here only Hello o/p bcoz String is Immutable
        String s = new String("   Hello   ");
        String s1 = new String("Ajinkya");
        s.concat(" Word");
        System.out.println(s);

        // Various string Methods()...
        System.out.println(s.charAt(2)); 
        System.out.println(s.isEmpty()); 
        System.out.println(s.toLowerCase()); 
        System.out.println(s.toUpperCase()); 
        System.out.println(s.lastIndexOf(s, 2)); 
        System.out.println(s.indexOf("e"));
        System.out.println(s.replace("l", "o")); 
        System.out.println(s.length());
        System.out.println();

        // compareTo()...
        System.out.println(s.compareTo(s1));

        // trim()...
        System.out.println(s.trim());

        // split()...
        String s2 = new String("Hello-welcome-to-java");
        String [] ss = s2.split("-");
        for (String st : ss) {
            System.out.println(st);
        }
    }
}
package LogicBasedExample;
import java.util.Scanner;

class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st, st1= "";
        System.out.println("Enter any string:");

        st = sc.nextLine();
        int len=st.length();
        for (int i=len-1; i>=0; i--) {
            st1= st1 +st.charAt(i);

        }
        if(st.equalsIgnoreCase(st1)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}

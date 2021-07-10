import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) throws IOException{
        String mobile;
        int mobPrice;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your mobile company name: ");
        mobile = br.readLine();
        System.out.println("Enter your mobile number: ");
        mobPrice = Integer.parseInt(br.readLine());
        System.out.println("Your mobile company name is: "+mobile +", Your mobile price is: "+mobPrice);
    }
}

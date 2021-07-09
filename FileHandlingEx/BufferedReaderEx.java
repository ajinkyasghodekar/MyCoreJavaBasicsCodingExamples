import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\T2.txt"));
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }
}
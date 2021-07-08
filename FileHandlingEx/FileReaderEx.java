import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\T2.txt");
        int i = fr.read();
        System.out.println("--------------------------------------------");
        while (i != -1) {
            System.out.print((char)i);
            i = fr.read();
        }
        System.out.println("\n--------------------------------------------");
        File f = new File("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\T2.txt");
        char [] ch = new char [(int)f.length()];
        FileReader fr1 = new FileReader(f);
        fr1.read(ch);
        for (char ch1 : ch) {
            System.out.print(ch1);
        }
        fr.close();
        fr1.close();
    }
}

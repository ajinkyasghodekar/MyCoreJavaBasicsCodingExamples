import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Java_Ex\\FileHandlingEx\\TextFiles", "demo.txt");
        f.createNewFile();
        System.out.println(f.delete());
    }
}

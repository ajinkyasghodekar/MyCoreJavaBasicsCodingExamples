import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Java_Ex\\FileHandlingEx\\TextFiles", "T1.txt");
        f.createNewFile();
        System.err.println(f.exists());
    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args)throws IOException {
        // Cteated file T2.txt at location 
        File f = new File("FileHandlingEx\\TextFiles", "T2.txt");
        f.createNewFile();
        // Passed upper file refrence as an input to FileWriter.
        FileWriter fw = new FileWriter(f);
        fw.write('A');
        fw.write("jinkya\n");
        fw.write(97);
        fw.write("\n");
        fw.write("Ajinkya is an Engineer...");
        fw.write("\n");
        char[] ch1= {'A', 'B', 'C'};
        fw.write(ch1);
        fw.flush();
        fw.close();
    }
}

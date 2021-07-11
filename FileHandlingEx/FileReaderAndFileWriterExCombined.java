import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriterExCombined {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\FileCombined.txt", true);
        FileReader fr = new FileReader("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\FileCombined.txt");
        fw.write("Hello I am Ajinkya and I am from Maharashtra...\n");
        fw.write("MH");
        fw.write("\n");
        char [] ch = {'S' ,'a', 'n', 'g', 'a', 'm','n', 'e', 'r'};
        fw.write(ch);
        fw.write("\n");
        fw.write("422605");
        fw.write("\n");
        fw.write("Thank You !!!");
        fw.write("\n");
        fw.flush();
        fw.close();
        System.out.println("-----------------------------------------");        
        int i = fr.read();
        while (i != -1) {
            System.out.print((char)i);
            i = fr.read();
        }
        System.out.println("\n-----------------------------------------");
    }
}

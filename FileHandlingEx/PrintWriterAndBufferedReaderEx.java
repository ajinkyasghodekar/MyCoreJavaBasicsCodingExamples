import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterAndBufferedReaderEx {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\PrintEx.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\PrintEx.txt"));
        pw.println("Hello I am Ajinkya and I am from Maharashtra...");
        pw.println("MH");
        char [] ch = {'S' ,'a', 'n', 'g', 'a', 'm','n', 'e', 'r'};
        pw.println(ch);
        pw.println("422605");
        pw.println("Thank You !!!");
        pw.flush();
        pw.close();

        System.out.println("----------------------------------------------");
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        System.out.println("----------------------------------------------");
    }
}

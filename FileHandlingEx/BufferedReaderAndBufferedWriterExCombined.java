import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.TreeUI;

public class BufferedReaderAndBufferedWriterExCombined {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\BufferedCombined.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\BufferedCombined.txt", true));
        bw.write("Hello I am Ajinkya and I am from Maharashtra...");
        bw.newLine();
        bw.write("MH");
        bw.newLine();
        char [] ch = {'S' ,'a', 'n', 'g', 'a', 'm','n', 'e', 'r'};
        bw.write(ch);
        bw.write("422605");
        bw.newLine();
        bw.write("Thank You !!!");
        bw.newLine();
        bw.flush();
        bw.close();
        System.out.println("------------------------------------------");
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        System.out.println("------------------------------------------");
    }

}

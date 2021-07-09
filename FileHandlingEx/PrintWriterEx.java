import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\Java_Ex\\FileHandlingEx\\TextFiles\\T3.txt", true));
        pw.write(100);
        //pw.println();
        pw.println(100);
        pw.println("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting");
        pw.println(1001);
        pw.println(true);
        char [] ch = {'A', 'B', 'C', 'D', 'E'};
        pw.print(ch);
        pw.flush();
        pw.close();
    }
}

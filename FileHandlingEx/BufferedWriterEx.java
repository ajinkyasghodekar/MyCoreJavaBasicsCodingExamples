import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    public static void main(String[] args){
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("FileHandlingEx\\TextFiles\\T2.txt", true));
            bw.write(100);
            bw.newLine();
            bw.write("Hello Ajinkya...");
            bw.newLine();
            bw.write("This is an example for BufferWriter in java file handling.");
            bw.newLine();
            char [] ch = {'A', 'B', 'C', 'D', 'E', 'F'};
            bw.write(ch);
            bw.newLine();   
            bw.flush();
            bw.close(); 
        } catch (IOException e) {
            System.out.println("File not fount please check given file");
        } 
    }
}

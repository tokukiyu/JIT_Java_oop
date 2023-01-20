package Java_file_handiling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt"));
            writer.write("hello file this is first line \n");
            writer.write("this is second line \n");
            writer.write("this is third line \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

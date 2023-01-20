package Java_file_handiling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("myfile.txt"));
            System.out.println(read.readLine());
            ;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

package day9_Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read_file {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\\\Users\\\\HEMANTH OLETI\\\\OneDrive\\\\Desktop\\\\New folder (2)\\student.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

package day10_Assignmentss;

import java.io.FileWriter;
import java.io.IOException;

public class append_file {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt", true); 
            writer.write("\nThis line is appended.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


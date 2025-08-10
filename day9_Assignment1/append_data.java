package day9_Assignment1;

import java.io.FileWriter;
import java.io.IOException;

public class append_data {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\student.txt", true);
            writer.write("6. Sateesh\n");
            writer.close();

            System.out.println("New student name appended to student.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}


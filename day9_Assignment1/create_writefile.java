package day9_Assignment1;

import java.io.FileWriter;
import java.io.IOException;

public class create_writefile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\student.txt");
            writer.write("1. Anjali\n");
            writer.write("2. Ravi\n");
            writer.write("3. Sneha\n");
            writer.write("4. Karan\n");
            writer.write("5. Hemanth\n");
            writer.close();

            System.out.println("Successfully written to student.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


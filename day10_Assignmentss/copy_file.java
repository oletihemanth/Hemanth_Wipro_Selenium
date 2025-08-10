package day10_Assignmentss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy_file {
    public static void main(String[] args) {
        try {
           
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\student.txt"));

            
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\destination.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();  
            }

           
            reader.close();
            writer.close();

            System.out.println("File copied successfully from source.txt to destination.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

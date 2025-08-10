package day10_Assignmentss;
//•	1. Write a program to create a new text file named test.txt.
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class create_file {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt"); 

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("File created at: " + path.toAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error while creating the file.");
            e.printStackTrace();
        }
    }
}


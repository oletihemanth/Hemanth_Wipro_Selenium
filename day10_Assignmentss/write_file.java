package day10_Assignmentss;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//•	3. Write a Java program to write "Hello, World!" into a file using FileWriter
public class write_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt"); 

        try {
            Files.write(path, List.of("Hello, World!"));
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
	}

}

package day10_Assignmentss;
//•	4. Write a program to read the content of a file line by line using BufferedReader.
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class read_file {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}


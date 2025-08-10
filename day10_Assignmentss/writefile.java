package day10_Assignmentss;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class writefile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt");

        try {
            Files.write(path, Arrays.asList("First line of data"), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Data written to file.");

            Files.write(path, Arrays.asList("This is an appended line."), StandardOpenOption.APPEND);
            System.out.println("Data appended to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


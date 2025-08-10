package day10_Assignmentss;
//•	11. Write a program to read a file using Scanner and display the tokens.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_file {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt"); 
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}

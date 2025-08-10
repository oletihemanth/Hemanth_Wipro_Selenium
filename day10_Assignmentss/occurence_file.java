package day10_Assignmentss;

//•	12. Write a program to search for a specific word in a file and count its occurrences.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class occurence_file {
    public static void main(String[] args) {
        String wordToFind = "Java";
        int count = 0;

        try {
            File file = new File("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt"); 
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equalsIgnoreCase(wordToFind)) {
                    count++;
                }
            }

            System.out.println("The word \"" + wordToFind + "\" occurred " + count + " times.");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}


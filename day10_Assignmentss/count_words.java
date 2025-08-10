package day10_Assignmentss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class count_words {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\HEMANTH OLETI\\\\OneDrive\\\\Desktop\\\\New folder (2)\\\\student.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;  // Count each line
                String[] words = line.trim().split("\\s+");  // Split line into words
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}


package day9_Assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\student.txt");

            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                String line = scanner.nextLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(line + "\n"); 
            }

            writer.close();
            System.out.println("User input saved to userinput.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}


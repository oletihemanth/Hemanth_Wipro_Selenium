package day10_Assignmentss;

import java.io.File;

public class file_properties {
    public static void main(String[] args) {
      
        File file = new File("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\student.txt");

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Name: " + file.getName());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size (bytes): " + file.length());
        } else {
            System.out.println("File report.txt does not exist.");
        }
    }
}


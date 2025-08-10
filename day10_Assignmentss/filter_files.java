package day10_Assignmentss;

//	9. Write a program to filter and display only .txt files from a folder using FilenameFilter.
import java.io.File;
import java.io.FilenameFilter;

public class filter_files {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)"); // Replace with actual folder path

        FilenameFilter txtFilter = (file, name) -> name.endsWith(".txt");

        File[] txtFiles = dir.listFiles(txtFilter);

        if (txtFiles != null && txtFiles.length > 0) {
            System.out.println(".txt files:");
            for (File f : txtFiles) {
                System.out.println(f.getName());
            }
        } else {
            System.out.println("No .txt files found.");
        }
    }
}

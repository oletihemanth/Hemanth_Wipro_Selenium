package day10_Assignmentss;
//•	13. Write a program to create, move, and delete a file using Files and Paths.
import java.nio.file.*;

public class path_file {
    public static void main(String[] args) {
        Path originalPath = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\testfile.txt");
        Path newPath = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\testfile_moved.txt");

        try {
            
            if (!Files.exists(originalPath)) {
                Files.createFile(originalPath);
                System.out.println("File created: " + originalPath);
            }

        
            if (!Files.exists(newPath.getParent())) {
                Files.createDirectories(newPath.getParent());
            }

       
            Files.move(originalPath, newPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to: " + newPath);

            Files.deleteIfExists(newPath);
            System.out.println("File deleted: " + newPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


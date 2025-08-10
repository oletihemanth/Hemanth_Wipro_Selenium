package day10_Assignmentss;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\STUDENT.ser"))) {
            Student student = (Student) in.readObject();
            System.out.println("Student object deserialized.");
            student.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


package day10_Assignmentss;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {
    public static void main(String[] args) {
        Student student = new Student(101, "Hemanth");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\STUDENT.ser"))) {
            out.writeObject(student);
            System.out.println("Student object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


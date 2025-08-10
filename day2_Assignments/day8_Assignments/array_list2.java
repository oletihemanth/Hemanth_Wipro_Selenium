package day8_Assignments;

/*
 * 9. Store Custom Objects Write a program to: • Create a class Student with


 * fields: id, name, and marks. • Create an ArrayList of Student objects. • Add
 * at least 3 students. • Display the details using a loop.
 * ________________________________________ 
 * 10. Copy One ArrayList to Another
 * Write a program to: • Create an ArrayList with some elements. • Create a
 * second ArrayList. • Copy all elements from the first to the second using
 * addAll() method.
 */

import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student(int i, String string) {
	}

	void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class array_list2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 3 students
        students.add(new Student(1, "Alice", 87.5));
        students.add(new Student(2, "Bob", 78.0));
        students.add(new Student(3, "Charlie", 92.3));

        // Display each student
        for (Student s : students) {
            s.display();
        }
    }
}


//ID: 1, Name: Alice, Marks: 87.5
//ID: 2, Name: Bob, Marks: 78.0
//ID: 3, Name: Charlie, Marks: 92.3

//import java.util.*;
//
//public class array_list2 {
//    public static void main(String[] args) {
//        ArrayList<String> originalList = new ArrayList<>();
//        originalList.add("Red");
//        originalList.add("Green");
//        originalList.add("Blue");
//
//        ArrayList<String> copiedList = new ArrayList<>();
//        copiedList.addAll(originalList);  // Copying elements
//
//        System.out.println("Original List: " + originalList);
//        System.out.println("Copied List: " + copiedList);
//    }
//}


//Original List: [Red, Green, Blue]
//Copied List: [Red, Green, Blue]

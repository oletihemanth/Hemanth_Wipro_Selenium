package day9_Assignments;

//Q6. Sort a list of students by marks (descending) using Comparator.
//Create a Comparator class or use a lambda expression to sort by marks

import java.util.*;

class Student0 {
 int rollNo;
 String name;
 double marks;

 public Student0(int rollNo, String name, double marks) {
     this.rollNo = rollNo;
     this.name = name;
     this.marks = marks;
 }

 @Override
 public String toString() {
     return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
 }
}
class MarksDescendingComparator implements Comparator<Student> {
 public int compare(Student s1, Student s2) {
     return Double.compare(s2.marks, s1.marks); // Descending
 }
}

public class example6 {
 public static void main(String[] args) {
     List<Student> students = new ArrayList<>();
     students.add(new Student(101, "Anjali", 88.5));
     students.add(new Student(102, "Ravi", 76.0));
     students.add(new Student(103, "Sneha", 91.2));
     students.add(new Student(104, "Karan", 84.3));

     System.out.println("Before Sorting:");
     for (Student s : students) {
         System.out.println(s);
     }
     Collections.sort(students, new MarksDescendingComparator());

     System.out.println("\nAfter Sorting by Marks (Descending):");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}

//Before Sorting:
//Roll No: 101, Name: Anjali, Marks: 88.5
//Roll No: 102, Name: Ravi, Marks: 76.0
//Roll No: 103, Name: Sneha, Marks: 91.2
//Roll No: 104, Name: Karan, Marks: 84.3
//
//After Sorting by Marks (Descending):
//Roll No: 103, Name: Sneha, Marks: 91.2
//Roll No: 101, Name: Anjali, Marks: 88.5
//Roll No: 104, Name: Karan, Marks: 84.3
//Roll No: 102, Name: Ravi, Marks: 76.0
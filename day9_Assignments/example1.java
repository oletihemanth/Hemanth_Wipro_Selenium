package day9_Assignments;
//Q1. Sort a list of students by roll number (ascending) using Comparable.

//Create a Student class with fields: rollNo, name, and marks. Implement the Comparable interface to sort students by their roll numbers

import java.util.*;


class Student implements Comparable<Student> {
 int rollNo;
 String name;
 double marks;

 public Student(int rollNo, String name, double marks) {
     this.rollNo = rollNo;
     this.name = name;
     this.marks = marks;
 }

 @Override
 public int compareTo(Student other) {
     return Integer.compare(this.rollNo, other.rollNo); 
 }
 @Override
 public String toString() {
     return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
 }
}

public class example1 {
 public static void main(String[] args) {

     List<Student> studentList = new ArrayList<>();
     studentList.add(new Student(103, "Ravi", 88.5));
     studentList.add(new Student(101, "Anjali", 92.0));
     studentList.add(new Student(105, "Sneha", 79.0));
     studentList.add(new Student(102, "Karan", 85.0));

     Collections.sort(studentList);

     System.out.println("Students sorted by Roll Number (Ascending):");
     for (Student s : studentList) {
         System.out.println(s);
     }
 }
}

//Students sorted by Roll Number (Ascending):
//Roll No: 101, Name: Anjali, Marks: 92.0
//Roll No: 102, Name: Karan, Marks: 85.0
//Roll No: 103, Name: Ravi, Marks: 88.5
//Roll No: 105, Name: Sneha, Marks: 79.0
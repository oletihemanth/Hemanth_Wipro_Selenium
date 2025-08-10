package day7_Assignments;
//6.	Create a class Student with name and marks. Write a method to update the marks of a student. Demonstrate the changes in the original object.
//Define the Student class
class Student {
 String name;
 int marks;
}

public class example3 {
 public static void main(String[] args) {
     // Create a Student object
     Student s1 = new Student();
     s1.name = "Rahul";
     s1.marks = 75;

     // Print initial details
     System.out.println("Before update:");
     System.out.println("Name: " + s1.name);
     System.out.println("Marks: " + s1.marks);

     // Update marks by passing the object
     updateMarks(s1);

     // Print updated details
     System.out.println("\nAfter update:");
     System.out.println("Name: " + s1.name);
     System.out.println("Marks: " + s1.marks);
 }

 // Method that updates the marks of a student
 static void updateMarks(Student student) {
     student.marks = 90;  // Updating marks
 }
}

//Before update:
//Name: Rahul
//Marks: 75
//
//After update:
//Name: Rahul
//Marks: 90
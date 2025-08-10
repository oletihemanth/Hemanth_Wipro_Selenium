package day4_Assignment;

//Design an abstract class Person with fields like name, age, and abstract method getRoleInfo().
//Create subclasses:
//•	Student: has course and roll number.
//•	Professor: has subject and salary.
//•	TeachingAssistant: extends Student and implements getRoleInfo() in a hybrid way.
//•	Create and print info for all roles using overridden getRoleInfo()

abstract class Person {
 protected String name;
 protected int age;
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
 abstract void getRoleInfo();
}
class Student extends Person {
 protected String course;
 protected int rollNumber;

 Student(String name, int age, String course, int rollNumber) {
     super(name, age);
     this.course = course;
     this.rollNumber = rollNumber;
 }

 @Override
 void getRoleInfo() {
     System.out.println("Student Info:");
     System.out.println("Name: " + name + ", Age: " + age);
     System.out.println("Course: " + course + ", Roll No: " + rollNumber);
 }
}
class Professor extends Person {
 private String subject;
 private double salary;

 Professor(String name, int age, String subject, double salary) {
     super(name, age);
     this.subject = subject;
     this.salary = salary;
 }

 void getRoleInfo() {
     System.out.println("Professor Info:");
     System.out.println("Name: " + name + ", Age: " + age);
     System.out.println("Subject: " + subject + ", Salary: ₹" + salary);
 }
}
class TeachingAssistant extends Student {
 private String assistantFor;

 TeachingAssistant(String name, int age, String course, int rollNumber, String assistantFor) {
     super(name, age, course, rollNumber);
     this.assistantFor = assistantFor;
 }

 @Override
 void getRoleInfo() {
     System.out.println("Teaching Assistant Info:");
     System.out.println("Name: " + name + ", Age: " + age);
     System.out.println("Course: " + course + ", Roll No: " + rollNumber);
     System.out.println("Assisting for: " + assistantFor);
 }
}

//Main class to test
public class example6 {
 public static void main(String[] args) {
     Student student = new Student("Sai", 20, "B.Tech CSE", 101);
     Professor professor = new Professor("Dr. Kumar", 45, "Data Structures", 85000);
     TeachingAssistant ta = new TeachingAssistant("Bob", 22, "M.Tech AI", 201, "Data Structures");

     System.out.println("\n--- Student ---");
     student.getRoleInfo();

     System.out.println("\n--- Professor ---");
     professor.getRoleInfo();

     System.out.println("\n--- Teaching Assistant ---");
     ta.getRoleInfo();
 }
}

package day9_Assignments;
//Q3. Create an Employee class and sort by name using Comparable.
//Use the compareTo() method to sort alphabetically by employee names

import java.util.*;

class Employee implements Comparable<Employee> {
 int id;
 String name;
 double salary;

 public Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 @Override
 public int compareTo(Employee other) {
     return this.name.compareToIgnoreCase(other.name); 
 }

 @Override
 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
 }
}

public class example3 {
 public static void main(String[] args) {
     List<Employee> employeeList = new ArrayList<>();
     employeeList.add(new Employee(102, "Zara", 65000));
     employeeList.add(new Employee(101, "Ankit", 50000));
     employeeList.add(new Employee(104, "Meena", 72000));
     employeeList.add(new Employee(103, "Bala", 60000));

     Collections.sort(employeeList);

     System.out.println("Employees sorted by Name (Alphabetically):");
     for (Employee e : employeeList) {
         System.out.println(e);
     }
 }
}

//Employees sorted by Name (Alphabetically):
//ID: 101, Name: Ankit, Salary: ₹50000.0
//ID: 103, Name: Bala, Salary: ₹60000.0
//ID: 104, Name: Meena, Salary: ₹72000.0
//ID: 102, Name: Zara, Salary: ₹65000.0
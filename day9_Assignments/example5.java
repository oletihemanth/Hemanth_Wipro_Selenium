package day9_Assignments;

//Q5. Implement a program that sorts a list of custom objects using Comparable, and displays them before and after sorting.
import java.util.*;
class Person implements Comparable<Person> {
 String name;
 int age;
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
 public int compareTo(Person other) {
     return Integer.compare(this.age, other.age); 
 }
 public String toString() {
     return "Name: " + name + ", Age: " + age;
 }
}

public class example5 {
 public static void main(String[] args) {
     List<Person> people = new ArrayList<>();
     people.add(new Person("Anjali", 24));
     people.add(new Person("Ravi", 30));
     people.add(new Person("Sneha", 21));
     people.add(new Person("Karan", 27));
     System.out.println("Before Sorting:");
     for (Person p : people) {
         System.out.println(p);
     }
     Collections.sort(people);
     System.out.println("\nAfter Sorting by Age (Ascending):");
     for (Person p : people) {
         System.out.println(p);
     }
 }
}

//Before Sorting:
//Name: Anjali, Age: 24
//Name: Ravi, Age: 30
//Name: Sneha, Age: 21
//Name: Karan, Age: 27
//
//After Sorting by Age (Ascending):
//Name: Sneha, Age: 21
//Name: Anjali, Age: 24
//Name: Karan, Age: 27
//Name: Ravi, Age: 30
package day9_Assignments;

//Q14. Use Comparator.comparing() with method references to sort objects in Java 8+.

import java.util.*;

class Candidate {
    private String name;
    private int age;
    private double salary;

    public Candidate(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - Age: " + age + " - Salary: " + salary;
    }
}

public class example13 {
    public static void main(String[] args) {
        List<Candidate> candidates = Arrays.asList(
            new Candidate("ram", 30, 70000),
            new Candidate("sai", 25, 80000),
            new Candidate("kumar", 28, 75000),
            new Candidate("anji", 35, 90000)
        );

        System.out.println("Sort by Name:");
        candidates.stream()
                  .sorted(Comparator.comparing(Candidate::getName))
                  .forEach(System.out::println);

        System.out.println("\nSort by Age:");
        candidates.stream()
                  .sorted(Comparator.comparingInt(Candidate::getAge))
                  .forEach(System.out::println);

        System.out.println("\nSort by Salary:");
        candidates.stream()
                  .sorted(Comparator.comparingDouble(Candidate::getSalary))
                  .forEach(System.out::println);
    }
}

//Sort by Name:
//anji - Age: 35 - Salary: 90000.0
//kumar - Age: 28 - Salary: 75000.0
//ram - Age: 30 - Salary: 70000.0
//sai - Age: 25 - Salary: 80000.0
//
//Sort by Age:
//sai - Age: 25 - Salary: 80000.0
//kumar - Age: 28 - Salary: 75000.0
//ram - Age: 30 - Salary: 70000.0
//anji - Age: 35 - Salary: 90000.0
//
//Sort by Salary:
//ram - Age: 30 - Salary: 70000.0
//kumar - Age: 28 - Salary: 75000.0
//sai - Age: 25 - Salary: 80000.0
//anji - Age: 35 - Salary: 90000.0

package day9_Assignments;

//Q11. Create a program where:
//Employee implements Comparable to sort by name
//Use Comparator to sort by marks
//Demonstrate both sorting techniques in the same program.

import java.util.*;

class Employees2 implements Comparable<Employees2> {
    private String name;
    private double salary;

    public Employees2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

 
    @Override
    public int compareTo(Employees2 other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

public class example11 {
    public static void main(String[] args) {
        List<Employees2> employees = new ArrayList<>();
        employees.add(new Employees2("sai", 45000));
        employees.add(new Employees2("ram", 55000));
        employees.add(new Employees2("ramji", 40000));
        employees.add(new Employees2("kumar", 60000));

        System.out.println("Original List:");
        for (Employees2 e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees);
        System.out.println("\nSorted by Name (Comparable):");
        for (Employees2 e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new Comparator<Employees2>() {
            @Override
            public int compare(Employees2 e1, Employees2 e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        System.out.println("\nSorted by Salary (Comparator):");
        for (Employees2 e : employees) {
            System.out.println(e);
        }
    }
}

//Original List:
//sai ($45000.0)
//ram ($55000.0)
//ramji ($40000.0)
//kumar ($60000.0)
//
//Sorted by Name (Comparable):
//kumar ($60000.0)
//ram ($55000.0)
//ramji ($40000.0)
//sai ($45000.0)
//
//Sorted by Salary (Comparator):
//ramji ($40000.0)
//sai ($45000.0)
//ram ($55000.0)
//kumar ($60000.0)

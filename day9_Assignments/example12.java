package day9_Assignments;

//Q13. Write a menu-driven program to sort Employee objects by name, salary, or department using Comparator.

import java.util.*;

class Workers {
    String name;
    double salary;
    String department;

    public Workers(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " - " + salary + " - " + department;
    }
}

public class example12 {
    public static void main(String[] args) {
        List<Workers> list = new ArrayList<>();
        list.add(new Workers("Alice", 70000, "HR"));
        list.add(new Workers("Bob", 80000, "IT"));
        list.add(new Workers("Charlie", 75000, "Finance"));
        list.add(new Workers("David", 72000, "IT"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose sorting criteria:");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Salary");
            System.out.println("3. Sort by Department");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(list, Comparator.comparing(w -> w.name));
                    break;
                case 2:
                    Collections.sort(list, Comparator.comparingDouble(w -> w.salary));
                    break;
                case 3:
                    Collections.sort(list, Comparator.comparing(w -> w.department));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            System.out.println("\nSorted List:");
            for (Workers w : list) {
                System.out.println(w);
            }
        }
    }
}


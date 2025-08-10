package day9_Assignments;

//Q8. Sort Employee objects by joining date using Comparator.
//Use Comparator to sort employees based on LocalDate or Date.

import java.time.LocalDate;
import java.util.*;

class Employees {
    String name;
    LocalDate joiningDate;

    public Employees(String name, LocalDate joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return name + " (Joined: " + joiningDate + ")";
    }
}

public class example8 {
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(new Employees("Alice", LocalDate.of(2020, 5, 10)));
        employeesList.add(new Employees("Bob", LocalDate.of(2018, 3, 15)));
        employeesList.add(new Employees("Charlie", LocalDate.of(2021, 1, 20)));
        employeesList.add(new Employees("David", LocalDate.of(2019, 8, 25)));

        System.out.println("Before Sorting:");
        for (Employees e : employeesList) {
            System.out.println(e);
        }

        employeesList.sort(Comparator.comparing(emp -> emp.joiningDate));

        System.out.println("\nAfter Sorting by Joining Date:");
        for (Employees e : employeesList) {
            System.out.println(e);
        }
    }
}

//Before Sorting:
//Alice (Joined: 2020-05-10)
//Bob (Joined: 2018-03-15)
//Charlie (Joined: 2021-01-20)
//David (Joined: 2019-08-25)
//
//After Sorting by Joining Date:
//Bob (Joined: 2018-03-15)
//David (Joined: 2019-08-25)
//Alice (Joined: 2020-05-10)
//Charlie (Joined: 2021-01-20)

package day9_Assignments;

//Q15. Use TreeSet with a custom comparator to sort a list of persons by age.
import java.util.*;

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class question14 {
    public static void main(String[] args) {
        // Comparator to sort by age
        Comparator<People> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        TreeSet<People> peopleSet = new TreeSet<>(ageComparator);

        peopleSet.add(new People("ram", 30));
        peopleSet.add(new People("sai", 25));
        peopleSet.add(new People("kumar", 28));
        peopleSet.add(new People("anjil", 35));

        System.out.println("People sorted by age:");
        for (People p : peopleSet) {
            System.out.println(p);
        }
    }
}

//People sorted by age:
//sai (Age: 25)
//kumar (Age: 28)
//ram (Age: 30)
//anjil (Age: 35)
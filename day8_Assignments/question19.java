package day8_Assignments;

//1. Create a TreeSet of Strings:
//o	Add 5 country names in random order.
//o	Print the sorted list of countries using TreeSet.

import java.util.TreeSet;

public class question19 {
    public static void main(String[] args) {
 
        TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("Brazil");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("Japan");

        System.out.println("Sorted countries: " + countries);
    }
}
//Sorted countries: [Australia, Brazil, Canada, India, Japan]
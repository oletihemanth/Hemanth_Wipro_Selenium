package day8_Assignments;

//3.	Create a TreeSet with a custom comparator:
//o	Sort strings in reverse alphabetical order using Comparator

import java.util.Comparator;
import java.util.TreeSet;

public class question21 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>(Comparator.reverseOrder());

        countries.add("India");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("Brazil");

        System.out.println("Countries in reverse alphabetical order: " + countries);
    }
}

//Countries in reverse alphabetical order: [USA, India, Germany, Brazil, Australia]
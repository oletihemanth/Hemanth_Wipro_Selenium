package day9_Assignments;

//Q10. Use an anonymous inner class to sort a list of strings by length.

import java.util.*;

public class example10 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Mango");
        strings.add("Banana");
        strings.add("Kiwi");
        strings.add("Watermelon");

        System.out.println("Before Sorting:");
        for (String str : strings) {
            System.out.println(str);
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length()); 
            }
        });

        System.out.println("\nAfter Sorting by Length (Ascending):");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

//Before Sorting:
//Apple
//Mango
//Banana
//Kiwi
//Watermelon
//
//After Sorting by Length (Ascending):
//Kiwi
//Apple
//Mango
//Banana
//Watermelon
package day8_Assignments;

//3.	Write a program to:
//o	Merge two LinkedHashSets and print the result.

import java.util.LinkedHashSet;

public class question18 {
    public static void main(String[] args) {
        
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Date");
        set2.add("Banana");  
        set2.add("Elderberry");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        set1.addAll(set2);

        System.out.println("Merged LinkedHashSet: " + set1);
    }
}

//Set 1: [Apple, Banana, Cherry]
//Set 2: [Date, Banana, Elderberry]
//Merged LinkedHashSet: [Apple, Banana, Cherry, Date, Elderberry]

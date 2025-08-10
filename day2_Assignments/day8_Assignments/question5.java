package day8_Assignments;

//8. Convert LinkedList to ArrayList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Convert it into an ArrayList.
//•	Display both the LinkedList and ArrayList.

import java.util.LinkedList;
import java.util.ArrayList;

public class question5 {
    public static void main(String[] args) {
        // Create LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Zebra");
        animals.add("Giraffe");

        // Display LinkedList
        System.out.println("LinkedList: " + animals);

        // Convert to ArrayList
        ArrayList<String> animalList = new ArrayList<>(animals);

        // Display ArrayList
        System.out.println("ArrayList: " + animalList);
    }
}

//LinkedList: [Lion, Tiger, Elephant, Zebra, Giraffe]
//ArrayList: [Lion, Tiger, Elephant, Zebra, Giraffe]
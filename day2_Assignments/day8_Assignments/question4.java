package day8_Assignments;

//7. Sort a LinkedList
//Write a program to:
//•	Create a LinkedList of integers.
//•	Add unsorted numbers.
//•	Sort the list using Collections.sort().
//•	Display the sorted list.

import java.util.LinkedList;
import java.util.Collections;

public class question4 {
    public static void main(String[] args) {
        // Create LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(45);
        numbers.add(10);
        numbers.add(78);
        numbers.add(23);
        numbers.add(56);

        System.out.println("Unsorted list: " + numbers);

        // Sort the list
        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);
    }
}

//Unsorted list: [45, 10, 78, 23, 56]
//Sorted list: [10, 23, 45, 56, 78]
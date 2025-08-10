package day8_Assignments;

//2.	Create a TreeSet of Integers:
//o	Add some numbers and print the first and last elements.
//o	Find the elements lower than and higher than a given number using lower() and higher() methods.

import java.util.TreeSet;

public class question20 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        System.out.println("TreeSet: " + numbers);

        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        int givenNumber = 15;

        System.out.println("Element lower than " + givenNumber + ": " + numbers.lower(givenNumber));
        System.out.println("Element higher than " + givenNumber + ": " + numbers.higher(givenNumber));
    }
}

//TreeSet: [5, 10, 15, 20, 25]
//First element: 5
//Last element: 25
//Element lower than 15: 10
//Element higher than 15: 20

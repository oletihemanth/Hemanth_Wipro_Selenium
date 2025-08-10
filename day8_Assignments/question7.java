package day8_Assignments;

//10. Clone a LinkedList
//Write a program to:
//•	Create a LinkedList of numbers.
//•	Clone it using the clone() method.
//•	Display both original and cloned lists.

import java.util.LinkedList;

public class question7 {
    public static void main(String[] args) {
 
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original LinkedList: " + numbers);

       
       
        LinkedList<Integer> clonedList = (LinkedList<Integer>) numbers.clone();

        System.out.println("Cloned LinkedList: " + clonedList);
    }
}

//Original LinkedList: [10, 20, 30, 40, 50]
//Cloned LinkedList: [10, 20, 30, 40, 50]

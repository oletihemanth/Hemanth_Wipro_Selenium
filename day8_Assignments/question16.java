package day8_Assignments;

//1.Create a LinkedHashSet of Integers:
//o	Add numbers: 10, 5, 20, 15, 5.
//o	Print the elements and observe the order.

import java.util.LinkedHashSet;

public class question16 {
    public static void main(String[] args) {
    
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); 

        System.out.println("LinkedHashSet elements: " + numbers);
    }
}

//LinkedHashSet elements: [10, 5, 20, 15]
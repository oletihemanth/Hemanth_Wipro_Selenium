package day8_Assignments;

//•	Create a Vector of integers and perform the following operations:
//•	Add 5 integers to the Vector.
//•	Insert an element at the 3rd position.
//•	Remove the 2nd element.
//•	Display the elements using Enumeration.

import java.util.Vector;
import java.util.Enumeration;

public class question8 {
    public static void main(String[] args) {
   
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original Vector: " + numbers);

        numbers.add(2, 99);
        System.out.println("After inserting 99 at 3rd position: " + numbers);

        numbers.remove(1);
        System.out.println("After removing 2nd element: " + numbers);

        System.out.println("Vector elements using Enumeration:");
        Enumeration<Integer> enumeration = numbers.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

//Original Vector: [10, 20, 30, 40, 50]
//After inserting 99 at 3rd position: [10, 20, 99, 30, 40, 50]
//After removing 2nd element: [10, 99, 30, 40, 50]
//Vector elements using Enumeration:
//10
//99
//30
//40
//50
package day8_Assignments;
/*List(ArrayList)
________________________________________
4. Sort Elements
Write a program to:
•	Create an ArrayList of integers.
•	Add at least 7 random numbers.
•	Sort the list in ascending order.
•	Display the sorted list.*/

import java.util.*;

//public class array_list {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        // Add some numbers
//        numbers.add(10);
//        numbers.add(25);
//        numbers.add(30);
//        numbers.add(45);
//        numbers.add(50);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to search: ");
//        int num = sc.nextInt();
//
//        if (numbers.contains(num)) {
//            System.out.println(num + " is found in the list.");
//        } else {
//            System.out.println(num + " is not found in the list.");
//        }
//
//        sc.close();
//    }
//}


//import java.util.*;
//
//public class array_list {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Mango");
//        fruits.add("Orange");
//        fruits.add("Grapes");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the fruit to remove: ");
//        String fruitToRemove = sc.nextLine();
//
//        if (fruits.remove(fruitToRemove)) {
//            System.out.println(fruitToRemove + " removed successfully.");
//        } else {
//            System.out.println(fruitToRemove + " not found in the list.");
//        }
//
//        System.out.println("Updated Fruit List: " + fruits);
//        sc.close();
//    }
//}

import java.util.*;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding at least 7 random numbers
        numbers.add(42);
        numbers.add(15);
        numbers.add(89);
        numbers.add(3);
        numbers.add(64);
        numbers.add(27);
        numbers.add(10);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted List in Ascending Order: " + numbers);
    }
}
//Original List: [42, 15, 89, 3, 64, 27, 10]
//Sorted List in Ascending Order: [3, 10, 15, 27, 42, 64, 89]


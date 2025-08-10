package day8_Assignments;

//5. Reverse the ArrayList
//Write a program to:
//•	Create an ArrayList of characters.
//•	Add 5 characters.
//•	Reverse the list using Collections.reverse() and display it.
//________________________________________
//6. Update an Element
//Write a program to:
//•	Create an ArrayList of subjects.
//•	Replace one of the subjects (e.g., “Math” to “Statistics”).
//•	Print the list before and after the update.
//________________________________________
//7. Remove All Elements
//Write a program to:
//•	Create an ArrayList of integers.
//•	Add multiple elements.
//•	Remove all elements using clear() method.
//•	Display the size of the list.
//________________________________________
//8. Iterate using Iterator
//Write a program to:
//•	Create an ArrayList of cities.
//•	Use Iterator to display each city.

//import java.util.*;
//
//public class array_list1 {
//    public static void main(String[] args) {
//        ArrayList<Character> chars = new ArrayList<>();
//        chars.add('A');
//        chars.add('B');
//        chars.add('C');
//        chars.add('D');
//        chars.add('E');
//
//        System.out.println("Original List: " + chars);
//
//        Collections.reverse(chars);
//
//        System.out.println("Reversed List: " + chars);
//    }
//}

//import java.util.*;
//
//public class array_list1 {
//    public static void main(String[] args) {
//        ArrayList<String> subjects = new ArrayList<>();
//        subjects.add("Math");
//        subjects.add("Science");
//        subjects.add("History");
//
//        System.out.println("Before update: " + subjects);
//
//        int index = subjects.indexOf("Math");
//        if (index != -1) {
//            subjects.set(index, "Statistics");
//        }
//        subjects.set(0, "Statistics");
//        System.out.println("After update: " + subjects);
//    }
//}

//import java.util.*;
//
//public class array_list1 {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(10);
//        numbers.add(15);
//
//        System.out.println("Original List: " + numbers);
//
//        numbers.clear();
//
//        System.out.println("After clear(), size = " + numbers.size());
//    }
//}

import java.util.*;

public class array_list1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Mumbai");

        Iterator<String> it = cities.iterator();
        System.out.println("Cities:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


//Cities:
//Hyderabad
//Bangalore
//Chennai
//Mumbai




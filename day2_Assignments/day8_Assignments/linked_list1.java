package day8_Assignments;

/*
 * List(LinkedList)

 * 
 * 1. Create and Display a LinkedList Write a program to: • Create a LinkedList
 * of Strings. • Add five colors to it. • Display the list using a for-each
 * loop. ________________________________________ 
 * 2. Add Elements at First and
 * Last Position Write a program to: • Create a LinkedList of integers. • Add
 * elements at the beginning and at the end. • Display the updated list.
 * ________________________________________
 *  3. Insert Element at Specific
 * Position Write a program to: • Create a LinkedList of names. • Insert a name
 * at index 2. • Display the list before and after insertion.
 * ________________________________________ 
 * 4. Remove Elements Write a program
 * to: • Create a LinkedList of animal names. • Remove the first and last
 * elements. • Remove a specific element by value. • Display the list after each
 * removal. ________________________________________ 
 * 5. Search for an Element
 * Write a program to: • Create a LinkedList of Strings. • Ask the user for a
 * string to search. • Display if the string is found or not.
 */

//import java.util.*;
//
//public class linked_list1 {
//    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Blue");
//        colors.add("Yellow");
//        colors.add("Purple");
//
//        System.out.println("Color List:");
//        for (String color : colors) {
//            System.out.println(color);
//        }
//    }
//}

//Color List:
//Red
//Green
//Blue
//Yellow
//Purple
//import java.util.*;
//
//public class linked_list1 {
//    public static void main(String[] args) {
//        LinkedList<Integer> numbers = new LinkedList<>();
//
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//
//        numbers.addFirst(5);
//        numbers.addLast(40);
//
//        System.out.println("Updated List: " + numbers);
//    }
//}

//Updated List: [5, 10, 20, 30, 40]
//import java.util.*;
//
//public class linked_list1 {
//    public static void main(String[] args) {
//        LinkedList<String> names = new LinkedList<>();
//        names.add("Ravi");
//        names.add("Anu");
//        names.add("Vijay");
//
//        System.out.println("Before Insertion: " + names);
//
//        names.add(2, "Deepa"); // Insert at index 2
//
//        System.out.println("After Insertion: " + names);
//    }
//}
//Before Insertion: [Ravi, Anu, Vijay]
//After Insertion: [Ravi, Anu, Deepa, Vijay]

//import java.util.*;
//
//public class linked_list1 {
//    public static void main(String[] args) {
//        LinkedList<String> animals = new LinkedList<>();
//        animals.add("Dog");
//        animals.add("Cat");
//        animals.add("Horse");
//        animals.add("Cow");
//        animals.add("Goat");
//
//        System.out.println("Original List: " + animals);
//
//        animals.removeFirst();  // Removes "Dog"
//        System.out.println("After removing first: " + animals);
//
//        animals.removeLast();   // Removes "Goat"
//        System.out.println("After removing last: " + animals);
//
//        animals.remove("Horse");  // Removes by value
//        System.out.println("After removing 'Horse': " + animals);
//    }
//}
//
//Original List: [Dog, Cat, Horse, Cow, Goat]
//After removing first: [Cat, Horse, Cow, Goat]
//After removing last: [Cat, Horse, Cow]
//After removing 'Horse': [Cat, Cow]
//import java.util.*;
//
//public class linked_list1 {
//    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add("C++");
//        list.add("JavaScript");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter element to search: ");
//        String input = sc.nextLine();
//
//        if (list.contains(input)) {
//            System.out.println(input + " is found in the list.");
//        } else {
//            System.out.println(input + " is not found in the list.");
//        }
//
//        sc.close();
//    }
//}

//Enter element to search: Java
//Java is found in the list.



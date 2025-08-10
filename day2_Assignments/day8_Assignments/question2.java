package day8_Assignments;

//3. Remove Specific Element
//Write a program to:
//•	Create an ArrayList of Strings.
//•	Add 5 fruits.
//•	Remove a specific fruit by name.
//•	Display the updated list.

import java.util.ArrayList;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Current fruits list: " + fruits);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name to remove: ");
        String fruitName = sc.nextLine();

        if (fruits.remove(fruitName)) {
            System.out.println(fruitName + " removed successfully.");
        } else {
            System.out.println(fruitName + " not found in the list.");
        }

        System.out.println("Updated fruits list: " + fruits);

        sc.close();
    }
}

//Current fruits list: [Apple, Banana, Orange, Mango, Grapes]
//Enter fruit name to remove: Banana
//Banana removed successfully.
//Updated fruits list: [Apple, Orange, Mango, Grapes]

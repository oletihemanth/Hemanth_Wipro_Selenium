package day8_Assignments;
//2. Search an Element
//Write a program to:
//•	Create an ArrayList of integers.
//•	Ask the user to enter a number.
//•	Check if the number exists in the list.
//________________________________________

import java.util.ArrayList;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNum = sc.nextInt();

        if (numbers.contains(searchNum)) {
            System.out.println(searchNum + " found in the list.");
        } else {
            System.out.println(searchNum + " not found in the list.");
        }

        sc.close();
    }
}

//Enter a number to search: 20
//20 found in the list.

package day8_Assignments;
//6. Iterate using ListIterator
//Write a program to:
//•	Create a LinkedList of cities.
//•	Use ListIterator to display the list in both forward and reverse directions.

import java.util.LinkedList;
import java.util.ListIterator;

public class question3 {
    public static void main(String[] args) {
        // Create LinkedList of cities
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Delhi");

        // Forward direction
        System.out.println("Cities in forward direction:");
        ListIterator<String> iterator = cities.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Reverse direction
        System.out.println("\nCities in reverse direction:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

//Cities in forward direction:
//Hyderabad
//Mumbai
//Chennai
//Bangalore
//Delhi
//
//Cities in reverse direction:
//Delhi
//Bangalore
//Chennai
//Mumbai
//Hyderabad
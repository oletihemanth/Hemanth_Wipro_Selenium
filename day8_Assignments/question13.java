package day8_Assignments;

//1.	Create a HashSet of Strings:
//o	Add 5 different city names.
//o	Try adding a duplicate city and observe the output.
//o	Iterate using an Iterator and print each city.

import java.util.HashSet;
import java.util.Iterator;

public class question13 {
    public static void main(String[] args) {
 
        HashSet<String> cities = new HashSet<>();

        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Delhi");

        System.out.println("HashSet after adding 5 cities: " + cities);

        boolean added = cities.add("Mumbai");
        if (!added) {
            System.out.println("Duplicate city 'Mumbai' was not added.");
        }

        System.out.println("Cities in the HashSet:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//HashSet after adding 5 cities: [Delhi, Chennai, Mumbai, Hyderabad, Bangalore]
//Duplicate city 'Mumbai' was not added.
//Cities in the HashSet:
//Delhi
//Chennai
//Mumbai
//Hyderabad
//Bangalore
package day8_Assignments;

//2.	Perform operations:
//o	Remove an element.
//o	Check if a city exists.
//o	Clear the entire HashSet.

import java.util.HashSet;

public class question14 {
    public static void main(String[] args) {
 
        HashSet<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Delhi");

        System.out.println("Original HashSet: " + cities);

        boolean removed = cities.remove("Chennai");
        if (removed) {
            System.out.println("Chennai removed successfully.");
        } else {
            System.out.println("Chennai not found in the HashSet.");
        }
        System.out.println("After removal: " + cities);

        String cityToCheck = "Delhi";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the HashSet.");
        } else {
            System.out.println(cityToCheck + " does not exist in the HashSet.");
        }

        cities.clear();
        System.out.println("After clearing, HashSet size: " + cities.size());
    }
}

//Original HashSet: [Delhi, Chennai, Mumbai, Hyderabad, Bangalore]
//Chennai removed successfully.
//After removal: [Delhi, Mumbai, Hyderabad, Bangalore]
//Delhi exists in the HashSet.
//After clearing, HashSet size: 0
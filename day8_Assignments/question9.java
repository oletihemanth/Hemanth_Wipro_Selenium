package day8_Assignments;

//•	Create a Vector of Strings and:
//•	Add at least 4 names.
//•	Check if a specific name exists in the vector.
//•	Replace one name with another.
//•	Clear all elements from the vector.

import java.util.Vector;

public class question9 {
    public static void main(String[] args) {
      
        Vector<String> names = new Vector<>();

        names.add("hemanth");
        names.add("sai");
        names.add("kumar");
        names.add("David");

        System.out.println("Original Vector: " + names);

        String searchName = "kumar";
        if (names.contains(searchName)) {
            System.out.println(searchName + " exists in the Vector.");
        } else {
            System.out.println(searchName + " does not exist in the Vector.");
        }

        int index = names.indexOf("sai");
        if (index != -1) {
            names.set(index, "ram");
            System.out.println("After replacing sai with ram: " + names);
        } else {
            System.out.println("sai not found in the Vector.");
        }

        names.clear();
        System.out.println("Vector after clearing all elements: " + names);
    }
}

//Original Vector: [hemanth, sai, kumar, David]
//kumar exists in the Vector.
//After replacing sai with ram: [hemanth, ram, kumar, David]
//Vector after clearing all elements: []
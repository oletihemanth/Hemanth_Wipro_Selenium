package day8_Assignments;

//3.	Write a method that takes a HashSet<Integer> and returns the maximum element.

import java.util.HashSet;
import java.util.NoSuchElementException;

public class example15 {

    public static int findMax(HashSet<Integer> set) {
        if (set == null || set.isEmpty()) {
            throw new NoSuchElementException("HashSet is empty or null");
        }

        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(25);
        numbers.add(12);
        numbers.add(78);
        numbers.add(34);
        numbers.add(90);

        int maxElement = findMax(numbers);
        System.out.println("Maximum element in HashSet: " + maxElement);
    }
}
//Maximum element in HashSet: 90
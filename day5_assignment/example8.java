package day5_assignment;
//Lambda expressions
//1.	Sum of Two Integers
//2.	Define a functional interface SumCalculator { int sum(int a, int b); } and a lambda expression to sum two integers.
//3.	Check If a String Is Empty
//Create a lambda (via a functional interface like Predicate<String>) that returns true if a given string is empty.
//Predicate<String> isEmpty = s -> s.isEmpty();
//4.	Filter Even or Odd Numbers 

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface SumCalculator {
    int sum(int a, int b);
}

public class example8 {
    public static void main(String[] args) {
        
        // 1. Sum of Two Integers
        SumCalculator add = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20: " + add.sum(10, 20));

        // 2. Check If a String Is Empty
        Predicate<String> isEmpty = s -> s.isEmpty();
        String test1 = "";
        String test2 = "Hello";
        System.out.println("\"\" is empty? " + isEmpty.test(test1));
        System.out.println("\"Hello\" is empty? " + isEmpty.test(test2));

        // 3. Filter Even or Odd Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Lambda for even filter
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

        // Lambda for odd filter
        List<Integer> odds = numbers.stream()
                                    .filter(n -> n % 2 != 0)
                                    .collect(Collectors.toList());

        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}

//Sum of 10 and 20: 30
//"" is empty? true
//"Hello" is empty? false
//Even numbers: [2, 4, 6, 8]
//Odd numbers: [1, 3, 5, 7, 9]
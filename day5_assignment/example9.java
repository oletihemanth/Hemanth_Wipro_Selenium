package day5_assignment;

//5.	 Convert Strings to Uppercase/Lowercase
//7.	 Aggregate Operations (Sum, Max, Average) on Double Arrays
//8.	Create similar lambdas for max/min. 
//9.	Calculate Factorial

import java.util.*;
import java.util.stream.*;

public class example9 {
    
    // 5. Convert Strings to Uppercase/Lowercase
    static class StringCaseConverter {
        interface Converter {
            String convert(String s);
        }

        void runExample() {
            Converter toUpper = s -> s.toUpperCase();
            Converter toLower = s -> s.toLowerCase();

            String text = "Hello World";
            System.out.println("Uppercase: " + toUpper.convert(text));
            System.out.println("Lowercase: " + toLower.convert(text));
        }
    }

    
    // 7 & 8. Aggregate Operations (Sum, Max, Average) & Max/Min
    static class AggregateOperations {
        void runExample() {
            double[] nums = {3.5, 7.2, 1.8, 4.9};

            double sum = Arrays.stream(nums).sum();
            double max = Arrays.stream(nums).max().orElse(Double.NaN);
            double min = Arrays.stream(nums).min().orElse(Double.NaN);
            double avg = Arrays.stream(nums).average().orElse(Double.NaN);

            System.out.println("Sum: " + sum);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + avg);
        }
    }

    // 9. Calculate Factorial
    static class FactorialCalculator {
        interface Factorial {
            long calculate(int n);
        }

        void runExample() {
            Factorial fact = n -> {
                long result = 1;
                for (int i = 1; i <= n; i++) result *= i;
                return result;
            };

            int number = 5;
            System.out.println("Factorial of " + number + ": " + fact.calculate(number));
        }
    }

    public static void main(String[] args) {
        System.out.println("=== String Case Converter ===");
        new StringCaseConverter().runExample();

     
       

        System.out.println("\n=== Aggregate Operations ===");
        new AggregateOperations().runExample();

        System.out.println("\n=== Factorial Calculator ===");
        new FactorialCalculator().runExample();
    }
}
//
//Uppercase: HELLO WORLD
//Lowercase: hello world
//
//=== Aggregate Operations ===
//Sum: 17.4
//Max: 7.2
//Min: 1.8
//Average: 4.35
//
//=== Factorial Calculator ===
//Factorial of 5: 120

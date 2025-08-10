package day8_Assignments;

//•	Write a program to:
//•	Copy all elements from one Vector to another Vector.
//•	Compare both vectors for equality.
//•	Write a method that takes a Vector<Integer> and returns the sum of all elements.

import java.util.Vector;

public class question10 {

    public static int sumVector(Vector<Integer> vec) {
        int sum = 0;
        for (int num : vec) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
     
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);
        
        Vector<Integer> vector2 = new Vector<>();
        
        vector2.addAll(vector1);
        
        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        
        if (vector1.equals(vector2)) {
            System.out.println("Both vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }
        
        int sum = sumVector(vector1);
        System.out.println("Sum of elements in Vector1: " + sum);
    }
}


//Vector1: [10, 20, 30, 40]
//Vector2: [10, 20, 30, 40]
//Both vectors are equal.
//Sum of elements in Vector1: 100
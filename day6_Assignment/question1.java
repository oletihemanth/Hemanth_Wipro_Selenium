//1.	Write a program to:
//o	Read an int value from user input.
//o	Assign it to a double (implicit widening) and print both.
//o	Read a double, explicitly cast it to int, then to short, and print results—demonstrate truncation or overflow.

package day6_Assignment;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();  
        double b = a; 
        System.out.println("Original int value: " + a);
        System.out.println("After implicit widening to double: " + b);
        System.out.print("\nEnter a double value: ");
        double b1 = sc.nextDouble(); 
        int a1 = (int) b1; 
        short s = (short) a1;

        System.out.println("Original double value: " + b1);
        System.out.println("After casting to int: " + a1  );
        System.out.println("After casting to short: " + s );

        sc.close();
    }
}

//Enter an integer: 10
//Original int value: 10
//After implicit widening to double: 10.0
//
//Enter a double value: 2.0
//Original double value: 2.0
//After casting to int: 2
//After casting to short: 2

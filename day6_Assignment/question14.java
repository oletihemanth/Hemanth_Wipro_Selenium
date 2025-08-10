//: Division & Array Access
//Write a Java class ExceptionDemo with a main method that:
//1.	Attempts to divide an integer by zero and access an array out of bounds.
//2.	Wrap each risky operation in its own try catch:
//o	Catch only the specific exception types: ArithmeticException and ArrayIndexOutOfBoundsException.
//o	In each catch, print a user-friendly message.
//3.	Add a finally block after each try catch that prints "Operation completed.".
//Example structure:
//try {
//    // division or array access
//} catch (ArithmeticException e) {
//    System.out.println("Division by zero is not allowed!");
//} finally {
//    System.out.println("Operation completed.");
//}

package day6_Assignment;

public class question14 {
    public static void main(String[] args) {

        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        } finally {
            System.out.println("Operation completed.");
        }

        System.out.println(); 
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}

//Division by zero is not allowed!
//Operation completed.
//
//Invalid array index!
//Operation completed.

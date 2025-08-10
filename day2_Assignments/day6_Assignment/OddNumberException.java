//Throw and Handle Custom Exception
//Create a class OddChecker:
//1.	Implement a static method:
//public static void checkOdd(int n) throws OddNumberException { /* ... */ }
//2.	If n is odd, throw a custom checked exception OddNumberException with message "Odd number: " + n.
//3.	In main:
//o	Call checkOdd with different values (including odd and even).
//o	Handle exceptions with try catch, printing e.getMessage() when caught.
//Define the exception like:
//public class OddNumberException extends Exception {
//    public OddNumberException(String message) { super(message); }
//}

package day6_Assignment;

public class OddNumberException extends Exception {
 public OddNumberException(String message) {
     super(message);
 }
}

class OddChecker {

 public static void checkOdd(int n) throws OddNumberException {
     if (n % 2 != 0) { // if odd
         throw new OddNumberException("Odd number: " + n);
     } else {
         System.out.println(n + " is even.");
     }
 }

 public static void main(String[] args) {
     int[] testNumbers = {2, 5, 8, 11};

     for (int num : testNumbers) {
         try {
             checkOdd(num);
         } catch (OddNumberException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}

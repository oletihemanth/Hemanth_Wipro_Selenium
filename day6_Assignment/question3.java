//Compound Assignment Behaviour 
//1.	Initialize int x = 5;.
//2.	Write two operations:
//x = x + 4.5;    // Does this compile? Why or why not?
//x += 4.5;       // What happens here?
//3.	Print results and explain behavior in comments (implicit narrowing, compile error vs. successful assignment).

package day6_Assignment;

public class question3 {
    public static void main(String[] args) {
        int x = 5;

        //  Normal assignment: x = x + 4.5;
        // This will NOT compile because:
        // - x + 4.5 results in a double (int promoted to double)
        // - You can't assign double to int without explicit cast
        // Uncommenting the line below will cause a compile-time error
        // x = x + 4.5;  // Compile error: incompatible types: possible lossy conversion from double to int

        //  Compound assignment: x += 4.5;
        // Here Java does an implicit cast after addition:
        // Equivalent to: x = (int)(x + 4.5);
        x += 4.5; // Fractional part (0.5) will be truncated

        System.out.println("Value of x after compound assignment: " + x);
    }
}
//Value of x after compound assignment: 9
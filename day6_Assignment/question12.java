//Calculator Operations Enum
//Create enum Operation (PLUS, MINUS, TIMES, DIVIDE) with an eval(double a, double b) method.
//Implement two versions:
//•	One using a switch(this) inside eval.
//•	Another using constant-specific method overrides for eval.
//Compare both designs.

package day6_Assignment;

enum OperationSwitch {
    PLUS, MINUS, TIMES, DIVIDE;

    double eval(double a, double b) {
        switch (this) {
            case PLUS:   return a + b;
            case MINUS:  return a - b;
            case TIMES:  return a * b;
            case DIVIDE: return a / b;
            default: throw new AssertionError("Unknown operation: " + this);
        }
    }
}

public class question12 {
    public static void main(String[] args) {
        for (OperationSwitch op : OperationSwitch.values()) {
            System.out.println(op + ": " + op.eval(10, 5));
        }
    }
}

//PLUS: 15.0
//MINUS: 5.0
//TIMES: 50.0
//DIVIDE: 2.0
//Shape Area Calculator
//Define enum Shape (CIRCLE, SQUARE, RECTANGLE, TRIANGLE) where each constant:
//•	Overrides a method double area(double... params) to compute its area.
//•	E.g., CIRCLE expects radius, TRIANGLE expects base and height.
//Loop over all constants with sample inputs and print results.

package day6_Assignment;

enum Shape {
    CIRCLE {
        double area(double... p) { return 3.14 * p[0] * p[0]; }
    },
    SQUARE {
        double area(double... p) { return p[0] * p[0]; }
    },
    RECTANGLE {
        double area(double... p) { return p[0] * p[1]; }
    },
    TRIANGLE {
        double area(double... p) { return 0.5 * p[0] * p[1]; }
    };

    abstract double area(double... p);
}

public class question7 {
    public static void main(String[] args) {
        double[][] inputs = {
            {5},       // Circle radius
            {4},       // Square side
            {5, 3},    // Rectangle length & width
            {6, 4}     // Triangle base & height
        };

        int i = 0;
        for (Shape s : Shape.values()) {
            System.out.println(s + " area = " + s.area(inputs[i++]));
        }
    }
}

//CIRCLE area = 78.5
//SQUARE area = 16.0
//RECTANGLE area = 15.0
//TRIANGLE area = 12.0

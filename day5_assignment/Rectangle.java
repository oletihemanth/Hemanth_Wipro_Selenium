package day5_assignment;

/**
 * Represents a Rectangle with width and height.
 * Ensures that width and height are always positive values.
 */
public class Rectangle {
   
    private double width;
    private double height;

    private static final double DEFAULT_DIMENSION = 1.0;

   
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Warning: Invalid width (" + width + "). Setting width to " + DEFAULT_DIMENSION + ".");
            this.width = DEFAULT_DIMENSION;
        }
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Warning: Invalid height (" + height + "). Setting height to " + DEFAULT_DIMENSION + ".");
            this.height = DEFAULT_DIMENSION;
        }
    }
    public double getArea() {
        return width * height;
    }

   
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("  Width: " + width);
        System.out.println("  Height: " + height);
        System.out.println("  Area: " + getArea());
        System.out.println("  Perimeter: " + getPerimeter());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Create rectangle objects with various inputs
        Rectangle rect1 = new Rectangle(10.0, 5.0);
        Rectangle rect2 = new Rectangle(-2.0, 7.0); // Invalid width
        Rectangle rect3 = new Rectangle(8.0, 0.0);  // Invalid height
        Rectangle rect4 = new Rectangle(15.5, 12.3);
        Rectangle rect5 = new Rectangle(0.0, -5.0); // Both invalid

        // Display details for each rectangle
        rect1.displayDetails();
        rect2.displayDetails(); // Width will be 1.0
        rect3.displayDetails(); // Height will be 1.0
        rect4.displayDetails();
        rect5.displayDetails(); // Both width and height will be 1.0

        // Demonstrate setter validation
        System.out.println("\nDemonstrating setter validation:");
        rect1.setWidth(-3.0); // Attempt to set invalid width
        rect1.setHeight(20.0); // Set valid height
        rect1.displayDetails();
    }
}

//Warning: Invalid width (-2.0). Setting width to 1.0.
//Warning: Invalid height (0.0). Setting height to 1.0.
//Warning: Invalid width (0.0). Setting width to 1.0.
//Warning: Invalid height (-5.0). Setting height to 1.0.
//Rectangle Details:
//  Width: 10.0
//  Height: 5.0
//  Area: 50.0
//  Perimeter: 30.0
//--------------------
//Rectangle Details:
//  Width: 1.0
//  Height: 7.0
//  Area: 7.0
//  Perimeter: 16.0
//--------------------
//Rectangle Details:
//  Width: 8.0
//  Height: 1.0
//  Area: 8.0
//  Perimeter: 18.0
//--------------------
//Rectangle Details:
//  Width: 15.5
//  Height: 12.3
//  Area: 190.65
//  Perimeter: 55.6
//--------------------
//Rectangle Details:
//  Width: 1.0
//  Height: 1.0
//  Area: 1.0
//  Perimeter: 4.0
//--------------------
//
//Demonstrating setter validation:
//Warning: Invalid width (-3.0). Setting width to 1.0.
//Rectangle Details:
//  Width: 1.0
//  Height: 20.0
//  Area: 20.0
//  Perimeter: 42.0
//--------------------

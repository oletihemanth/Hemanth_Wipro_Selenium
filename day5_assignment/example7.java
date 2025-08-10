package day5_assignment;

//Default and Static Methods in Interfaces
//•	Declare interface Polygon with:
//o	double getArea()
//o	default method default double getPerimeter(int... sides) that computes sum of sides
//o	a static helper static String shapeInfo() returning a description string
//•	Implement classes Rectangle and Triangle, providing appropriate getArea().
//•	In Main, call getPerimeter(...) and Polygon.shapeInfo().

interface Polygon {
 double getArea();
 default double getPerimeter(int... sides) {
     double perimeter = 0;
     for (int side : sides) {
         perimeter += side;
     }
     return perimeter;
 }

 static String shapeInfo() {
     return "Polygons are 2D shapes with straight sides.";
 }
}


class Rectangle9 implements Polygon {
 private double length, width;

 public Rectangle9(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width;
 }
}

class Triangle implements Polygon {
 private double base, height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height;
 }
}

public class example7 {
 public static void main(String[] args) {
     Rectangle9 rect = new Rectangle9(5, 3);
     Triangle tri = new Triangle(4, 6);

     System.out.println("Rectangle Area: " + rect.getArea());
     System.out.println("Rectangle Perimeter: " + rect.getPerimeter(5, 3, 5, 3));

     System.out.println("Triangle Area: " + tri.getArea());
     System.out.println("Triangle Perimeter: " + tri.getPerimeter(4, 5, 6));

     System.out.println(Polygon.shapeInfo());
 }
}


//Rectangle Area: 15.0
//Rectangle Perimeter: 16.0
//Triangle Area: 12.0
//Triangle Perimeter: 15.0
//Polygons are 2D shapes with straight sides.
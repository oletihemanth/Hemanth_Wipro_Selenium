package day4_Assignment;
//2.	Create a base class Shape with a method area() that prints a message.Then create two subclasses Circleoverride area() to calculator and print area of circle  Rectangle override area() to calculate and print area of a rectangle
class Shape {
    void area() {
        System.out.println("Area method from Shape class");
    }

	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
class Circle extends Shape {
    double radius=10.8;
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    double length=10, width=90;
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class example2 {
    public static void main(String[] args) {
        Circle s1 = new Circle();
        s1.area();  
        Rectangle s2 = new Rectangle();
        s2.area(); 
        Shape s3 = new Shape();
        s3.area(); 
    }
}

//Area of Circle: 366.4353671147135
//Area of Rectangle: 900.0
//Area method from Shape class

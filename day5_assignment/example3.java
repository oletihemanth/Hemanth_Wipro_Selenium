package day5_assignment;
//Moveable Shapes Simulation
//•	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
//•	Implement classes:
//o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
//o	MovableCircle(radius, center: MovablePoint)
//o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)
//•	Provide toString() to display positions.
//•	In main(), create a few objects and call move methods to simulate motion.


interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

class MovablePoint implements Movable {
 int x, y;
 int xSpeed, ySpeed;

 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 @Override
 public void moveUp() {
     y -= ySpeed;
 }

 @Override
 public void moveDown() {
     y += ySpeed;
 }

 @Override
 public void moveLeft() {
     x -= xSpeed;
 }

 @Override
 public void moveRight() {
     x += xSpeed;
 }

 @Override
 public String toString() {
     return "Point(" + x + ", " + y + ")";
 }
}

//MovableCircle.java
class MovableCircle implements Movable {
 private int radius;
 private MovablePoint center;

 public MovableCircle(int radius, int centerX, int centerY, int xSpeed, int ySpeed) {
     this.radius = radius;
     this.center = new MovablePoint(centerX, centerY, xSpeed, ySpeed);
 }

 @Override
 public void moveUp() {
     center.moveUp();
 }

 @Override
 public void moveDown() {
     center.moveDown();
 }

 @Override
 public void moveLeft() {
     center.moveLeft();
 }

 @Override
 public void moveRight() {
     center.moveRight();
 }

 @Override
 public String toString() {
     return "Circle(center=" + center + ", radius=" + radius + ")";
 }
}


class MovableRectangle implements Movable {
 private MovablePoint topLeft;
 private MovablePoint bottomRight;

 public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
     topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
     bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
 }

 private boolean sameSpeed() {
     return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
 }

 @Override
 public void moveUp() {
     if (sameSpeed()) {
         topLeft.moveUp();
         bottomRight.moveUp();
     } else {
         System.out.println("Points have different speeds. Cannot move rectangle.");
     }
 }

 @Override
 public void moveDown() {
     if (sameSpeed()) {
         topLeft.moveDown();
         bottomRight.moveDown();
     } else {
         System.out.println("Points have different speeds. Cannot move rectangle.");
     }
 }

 @Override
 public void moveLeft() {
     if (sameSpeed()) {
         topLeft.moveLeft();
         bottomRight.moveLeft();
     } else {
         System.out.println("Points have different speeds. Cannot move rectangle.");
     }
 }

 @Override
 public void moveRight() {
     if (sameSpeed()) {
         topLeft.moveRight();
         bottomRight.moveRight();
     } else {
         System.out.println("Points have different speeds. Cannot move rectangle.");
     }
 }

 @Override
 public String toString() {
     return "Rectangle(topLeft=" + topLeft + ", bottomRight=" + bottomRight + ")";
 }
}

public class example3 {
 public static void main(String[] args) {
     MovablePoint p = new MovablePoint(0, 0, 2, 2);
     System.out.println("Initial Point: " + p);
     p.moveRight();
     p.moveUp();
     System.out.println("After moving point: " + p);

     MovableCircle c = new MovableCircle(5, 10, 10, 1, 1);
     System.out.println("\nInitial Circle: " + c);
     c.moveDown();
     c.moveLeft();
     System.out.println("After moving circle: " + c);

     MovableRectangle r = new MovableRectangle(0, 0, 4, 4, 2, 2);
     System.out.println("\nInitial Rectangle: " + r);
     r.moveUp();
     r.moveRight();
     System.out.println("After moving rectangle: " + r);
 }
}

//Initial Point: Point(0, 0)
//After moving point: Point(2, -2)
//
//Initial Circle: Circle(center=Point(10, 10), radius=5)
//After moving circle: Circle(center=Point(9, 11), radius=5)
//
//Initial Rectangle: Rectangle(topLeft=Point(0, 0), bottomRight=Point(4, 4))
//After moving rectangle: Rectangle(topLeft=Point(2, -2), bottomRight=Point(6, 2))

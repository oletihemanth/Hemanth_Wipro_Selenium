package day7_Assignments;
//4.	Create a class Box with a variable length. Write a method that modifies the value of length by passing the Box object. Show that the original object is modified.

class Box {
 int length;
}

public class modify_box {
 public static void main(String[] args) {
     Box myBox = new Box();
     myBox.length = 10;

     System.out.println("Before modification: " + myBox.length);
     modifyLength(myBox);
     System.out.println("After modification: " + myBox.length);
 }
 static void modifyLength(Box b) {
     b.length = 25;  
 }
}


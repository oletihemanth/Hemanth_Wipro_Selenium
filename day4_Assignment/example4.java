package day4_Assignment;

//4.	Runtime Polymorphism with constructor Chaining . create a class vehicle with a constructor that prints “Vehicle Created”.Create a subclass Bike that override a method and uses super() in constructor

class Vehicle {
 Vehicle() {
     System.out.println("Vehicle Created");
 }
 void start() {
     System.out.println("Vehicle is starting...");
 }
}
class Bike extends Vehicle {
 Bike() {
     super(); 
     System.out.println("Bike Created");
 }
 void start() {
     System.out.println("Bike is starting with a key...");
 }
}
public class example4 {
 public static void main(String[] args) {
     Vehicle v = new Bike();  
     v.start();
 }
}

//Vehicle Created
//Bike Created
//Bike is starting with a key...

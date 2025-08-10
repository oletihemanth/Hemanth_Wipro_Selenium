package day4_Assignment;

//Create a base class Vehicle with method start().
//Derive Car, Bike, and Truck from it and override the start() method.
//•	Create a static method that accepts Vehicle type and calls start().
//•	Pass different vehicle objects to test polymorphism.
class A {
 void start() {
     System.out.println("Vehicle is starting...");
 }
}
class Car extends A {
 void start() {
     System.out.println("Car is starting with a key...");
 }
}
class Bike1 extends A {
 void start() {
     System.out.println("Bike is starting with a kick...");
 }
}
class Truck extends A {
 void start() {
     System.out.println("Truck is starting with a button...");
 }
}

public class example5 {
 public static void startVehicle(A v) {
     v.start();  
 }

 public static void main(String[] args) {
     Car car = new Car();
     Bike1 bike = new Bike1();
     Truck truck = new Truck();


     System.out.println("--- Car ---");
     startVehicle(car);

     System.out.println("--- Bike ---");
     startVehicle(bike);

     System.out.println("--- Truck ---");
     startVehicle(truck);
 }
}

//--- Car ---
//Car is starting with a key...
//--- Bike ---
//Bike is starting with a kick...
//--- Truck ---
//Truck is starting with a button...
package day5_assignment;

//Extended Interface Hierarchy
//
//•	Define interface BaseVehicle with method void start().
//•	Define interface AdvancedVehicle that extends BaseVehicle, adding method void stop() and boolean refuel(int amount).
//•	Implement Car to satisfy both interfaces; include a constructor initializing fuel level.
//•	In Main, manipulate the object via both interface types

interface BaseVehicle {
 void start();
}

interface AdvancedVehicle extends BaseVehicle {
 void stop();
 boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
 private int fuelLevel;

 public Car(int initialFuel) {
     this.fuelLevel = initialFuel;
 }

 @Override
 public void start() {
     if (fuelLevel > 0) {
         System.out.println("Car started. Fuel level: " + fuelLevel + " liters.");
     } else {
         System.out.println("Cannot start. Fuel tank empty!");
     }
 }

 @Override
 public void stop() {
     System.out.println("Car stopped.");
 }

 @Override
 public boolean refuel(int amount) {
     if (amount > 0) {
         fuelLevel += amount;
         System.out.println("Refueled " + amount + " liters. Total fuel: " + fuelLevel + " liters.");
         return true;
     } else {
         System.out.println("Refuel amount must be positive!");
         return false;
     }
 }
}

public class example5 {
 public static void main(String[] args) {
     BaseVehicle baseRef = new Car(5);
     baseRef.start();
     

     System.out.println();

     AdvancedVehicle advRef = new Car(0);
     advRef.start();
     advRef.refuel(10);
     advRef.start();
     advRef.stop();
 }
}

//Car started. Fuel level: 5 liters.
//
//Cannot start. Fuel tank empty!
//Refueled 10 liters. Total fuel: 10 liters.
//Car started. Fuel level: 10 liters.
//Car stopped.

package day4_Assignment;

//Create an abstract class SmartDevice with methods like turnOn(), turnOff(), and performFunction().
//Create child classes:
//•	SmartPhone: performs calling and browsing.
//•	SmartWatch: tracks fitness and time.
//•	SmartSpeaker: plays music and responds to voice commands.
//•	
//•	Write code to store all objects in an array and use polymorphism to invoke their performFunction().


abstract class SmartDevice {
 abstract void turnOn();
 abstract void turnOff();
 abstract void performFunction(); 
}

class SmartPhone extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("SmartPhone is powering on...");
 }

 @Override
 void turnOff() {
     System.out.println("SmartPhone is shutting down...");
 }

 @Override
 void performFunction() {
     System.out.println("Making calls and browsing the internet.");
 }
}

class SmartWatch extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("SmartWatch is turning on...");
 }

 @Override
 void turnOff() {
     System.out.println("SmartWatch is turning off...");
 }

 @Override
 void performFunction() {
     System.out.println("Tracking fitness and showing time.");
 }
}

class SmartSpeaker extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("SmartSpeaker is starting up...");
 }

 @Override
 void turnOff() {
     System.out.println("SmartSpeaker is turning off...");
 }

 @Override
 void performFunction() {
     System.out.println("Playing music and responding to voice commands.");
 }
}

public class example7 {
 public static void main(String[] args) {
     SmartDevice[] devices = {
         new SmartPhone(),
         new SmartWatch(),
         new SmartSpeaker()
     };
     for (SmartDevice device : devices) {
         device.turnOn();
         device.performFunction();
         device.turnOff();
         System.out.println("-------------------");
     }
 }
}

//SmartPhone is shutting down...
//-------------------
//SmartWatch is turning on...
//Tracking fitness and showing time.
//SmartWatch is turning off...
//-------------------
//SmartSpeaker is starting up...
//Playing music and responding to voice commands.
//SmartSpeaker is turning off...
//-------------------
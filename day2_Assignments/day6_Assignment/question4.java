//Object Casting with Inheritance 

//1.	Define an Animal class with a method makeSound().
//2.	Define subclass Dog:
//o	Override makeSound() (e.g. "Woof!").
//o	Add method fetch().
//3.	In main:
//Dog d = new Dog();
//Animal a = d;          // upcasting
//a.makeSound();

package day6_Assignment;

class Animal {
 public void makeSound() {
     System.out.println(" animal sound");
 }
}
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Woooooof");
 }

 public void fetch() {
     System.out.println("Dog is fetching the ball...");
 }
}

public class question4 {
 public static void main(String[] args) {
     Dog d = new Dog();

     Animal a = d;
     a.makeSound(); 
 }
}

//Woooooof
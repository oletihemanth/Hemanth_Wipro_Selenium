package day9_Assignments;
//Q2. Create a Product class and sort products by price using Comparable.

//Implement Comparable<Product> and sort a list of products using Collections.sort().

import java.util.*;
class Product implements Comparable<Product> {
 int id;
 String name;
 double price;

 public Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 public int compareTo(Product other) {
     return Double.compare(this.price, other.price); // Ascending order
 }

 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Price: ₹" + price;
 }
}

public class example2 {
 public static void main(String[] args) {
   
     List<Product> products = new ArrayList<>();
     products.add(new Product(101, "Laptop", 55000.0));
     products.add(new Product(102, "Mobile", 15000.0));
     products.add(new Product(103, "Headphones", 2000.0));
     products.add(new Product(104, "Monitor", 8000.0));

     Collections.sort(products);

     System.out.println("Products sorted by price (Ascending):");
     for (Product p : products) {
         System.out.println(p);
     }
 }
}

//Products sorted by price (Ascending):
//ID: 103, Name: Headphones, Price: ₹2000.0
//ID: 104, Name: Monitor, Price: ₹8000.0
//ID: 102, Name: Mobile, Price: ₹15000.0
//ID: 101, Name: Laptop, Price: ₹55000.0

//package day9_Assignments;
//
////Q7. Create multiple sorting strategies for a Product class.
////Implement comparators to sort by:
////Price ascending
////Price descending
////Name alphabetically
//
//import java.util.*;
//
////Product class
//class Product9 {
// int id;
// String name;
// double price;
//
// public Product9(int id, String name, double price) {
//     this.id = id;
//     this.name = name;
//     this.price = price;
// }
//
// // For displaying product details
// @Override
// public String toString() {
//     return "ID: " + id + ", Name: " + name + ", Price: ₹" + price;
// }
//}
//
////Comparator for Price Ascending
//class PriceAscComparator implements Comparator<Product9> {
// public int compare(Product9 p1, Product9 p2) {
//     return Double.compare(p1.price, p2.price);
// }
//}
//
////Comparator for Price Descending
//class PriceDescComparator implements Comparator<Product> {
// public int compare(Product p1, Product p2) {
//     return Double.compare(p2.price, p1.price);
// }
//}
//
////Comparator for Name Alphabetically
//class NameComparator implements Comparator<Product> {
// public int compare(Product p1, Product p2) {
//     return p1.name.compareToIgnoreCase(p2.name);
// }
//}
//
//public class example7 {
// public static void main(String[] args) {
//     // Create list of products
//     List<Product9> products = new ArrayList<>();
//     products.add(new Product9(101, "Laptop", 55000.0));
//     products.add(new Product9(102, "Mobile", 15000.0));
//     products.add(new Product9(103, "Headphones", 2000.0));
//     products.add(new Product9(104, "Monitor", 8000.0));
//
//     // Price Ascending
//     Collections.sort(products, new PriceAscComparator());
//     System.out.println("Products sorted by Price (Ascending):");
//     products.forEach(System.out::println);
//
//     // Price Descending
//     Collections.sort(products, new PriceDescComparator());
//     System.out.println("\nProducts sorted by Price (Descending):");
//     products.forEach(System.out::println);
//
//     // Name Alphabetically
//     Collections.sort(products, new NameComparator());
//     System.out.println("\nProducts sorted by Name (Alphabetically):");
//     products.forEach(System.out::println);
// }
//}
//

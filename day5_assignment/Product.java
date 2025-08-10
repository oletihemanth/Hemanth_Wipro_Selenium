//5. Builder Pattern & Encapsulation: Immutable Product
//Use Builder design to create immutable class with encapsulation.
//•	Create an immutable Product class with private final fields such as name, code, price, and optional category.
//•	Use a static nested Builder inside the Product class. Provide methods like withName(), withPrice(), etc., that apply validation (e.g. non-negative price).
//•	The outer class should have only getter methods, no setters.
//•	The builder returns a new Product instance only when all validations succeed


package day5_assignment;


public final class Product {

 private final String name;
 private final String code;
 private final double price;
 private final String category;

 private Product(Builder builder) {
     this.name = builder.name;
     this.code = builder.code;
     this.price = builder.price;
     this.category = builder.category;
 }

 public String getName() {
     return name;
 }

 public String getCode() {
     return code;
 }

 public double getPrice() {
     return price;
 }

 public String getCategory() {
     return category;
 }

 // Static nested Builder class
 public static class Builder {
     private String name;
     private String code;
     private double price;
     private String category;

     // Builder methods with validation
     public Builder withName(String name) {
         if (name == null || name.trim().isEmpty()) {
             throw new IllegalArgumentException("Product name cannot be null or empty.");
         }
         this.name = name;
         return this;
     }

     public Builder withCode(String code) {
         if (code == null || code.trim().isEmpty()) {
             throw new IllegalArgumentException("Product code cannot be null or empty.");
         }
         this.code = code;
         return this;
     }

     public Builder withPrice(double price) {
         if (price < 0) {
             throw new IllegalArgumentException("Price cannot be negative.");
         }
         this.price = price;
         return this;
     }

     public Builder withCategory(String category) {
         this.category = category; 
         return this;
     }

     public Product build() {
         if (name == null) {
             throw new IllegalStateException("Product name is required.");
         }
         if (code == null) {
             throw new IllegalStateException("Product code is required.");
         }
         if (price < 0) {
             throw new IllegalStateException("Invalid price.");
         }
         return new Product(this);
     }
 }

 // Override toString for display
 @Override
 public String toString() {
     return String.format("Product{name='%s', code='%s', price=%.2f, category='%s'}",
             name, code, price, category != null ? category : "N/A");
 }

 // Example usage
 public static void main(String[] args) {
     Product product = new Product.Builder()
             .withName("Laptop")
             .withCode("LP1001")
             .withPrice(59999.99)
             .withCategory("Electronics")
             .build();

     System.out.println(product);

 }
}

//Product{name='Laptop', code='LP1001', price=59999.99, category='Electronics'}


package day7_Assignments;
//8.	Write a program where you assign a new object to a reference passed into a method. Show that the original reference does not change.

class Book {
 String title;
}

public class example5 {
 public static void main(String[] args) {
      
	 Book myBook = new Book();
     myBook.title = "Java Basics";

     System.out.println("Before method call: " + myBook.title);

     reassignBook(myBook);

     System.out.println("After method call: " + myBook.title);
 }

 static void reassignBook(Book bookRef) {
     bookRef = new Book();
     bookRef.title = "Advanced Java";

     System.out.println("Inside method: " + bookRef.title);
 }
}

//Before method call: Java Basics
//Inside method: Advanced Java
//After method call: Java Basics
package day9_Assignments;
//Q4. Sort a list of Book objects by bookId in descending order using Comparable.
//Hint: Override compareTo() to return the reverse order

import java.util.*;
class Book implements Comparable<Book> {
 int bookId;
 String title;
 String author;
 public Book(int bookId, String title, String author) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
 }
 public int compareTo(Book other) {
     return Integer.compare(other.bookId, this.bookId); 
 }
 public String toString() {
     return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
 }
}

public class example4 {
 public static void main(String[] args) {
     List<Book> books = new ArrayList<>();
     books.add(new Book(103, "The Alchemist", "Paulo Coelho"));
     books.add(new Book(101, "1984", "George Orwell"));
     books.add(new Book(105, "Sapiens", "Yuval Noah Harari"));
     books.add(new Book(102, "To Kill a Mockingbird", "Harper Lee"));
     Collections.sort(books);
     System.out.println("Books sorted by Book ID (Descending):");
     for (Book b : books) {
         System.out.println(b);
     }
 }
}

//Books sorted by Book ID (Descending):
//Book ID: 105, Title: Sapiens, Author: Yuval Noah Harari
//Book ID: 103, Title: The Alchemist, Author: Paulo Coelho
//Book ID: 102, Title: To Kill a Mockingbird, Author: Harper Lee
//Book ID: 101, Title: 1984, Author: George Orwell

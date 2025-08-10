package day8_Assignments;

//9. Store Custom Objects in LinkedList
//Write a program to:
//•	Create a class Book with fields: id, title, and author.
//•	Create a LinkedList of Book objects.
//•	Add 3 books and display their details using a loop.

import java.util.LinkedList;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

public class question6 {
    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Effective Java", "Joshua Bloch"));
        books.add(new Book(103, "Clean Code", "Robert C. Martin"));

   
        System.out.println("Book Details:");
        for (Book b : books) {
            b.display();
        }
    }
}

//Book Details:
//ID: 101, Title: Java Programming, Author: James Gosling
//ID: 102, Title: Effective Java, Author: Joshua Bloch
//ID: 103, Title: Clean Code, Author: Robert C. Martin

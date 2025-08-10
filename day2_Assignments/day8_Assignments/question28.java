package day8_Assignments;
//3.	Browser History Simulation:
//o	Implement browser back and forward navigation using two deques.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Deque<String> backStack = new LinkedList<>();
        Deque<String> forwardStack = new LinkedList<>();
        String currentPage = "Home";

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nCurrent Page: " + currentPage);
            System.out.println("1. Visit new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String newPage = sc.nextLine();
                    backStack.push(currentPage); 
                    currentPage = newPage;
                    forwardStack.clear(); 
                    break;

                case 2:
                    if (!backStack.isEmpty()) {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                    } else {
                        System.out.println("No pages in back history.");
                    }
                    break;

                case 3:
                    if (!forwardStack.isEmpty()) {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                    } else {
                        System.out.println("No pages in forward history.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting browser simulation...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

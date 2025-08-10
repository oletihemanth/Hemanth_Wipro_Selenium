package day8_Assignments;

//2.	Double-ended Order System:
//o	Add items from front and rear.
//o	Remove items from both ends.
//o	Display contents of the deque after each operation.

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class question27 {
    public static void main(String[] args) {
        Deque<String> orders = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
  
        orders.addFirst("Order1"); 
        System.out.println("Added at front: Order1 -> " + orders);

        orders.addLast("Order2");  
        System.out.println("Added at rear: Order2 -> " + orders);

        orders.addFirst("Order3"); 
        System.out.println("Added at front: Order3 -> " + orders);

        orders.addLast("Order4");  
        System.out.println("Added at rear: Order4 -> " + orders);

        System.out.println("Removed from front: " + orders.removeFirst());
        System.out.println("After removal -> " + orders);

        System.out.println("Removed from rear: " + orders.removeLast());
        System.out.println("After removal -> " + orders);
    }
}

//Added at front: Order1 -> [Order1]
//Added at rear: Order2 -> [Order1, Order2]
//Added at front: Order3 -> [Order3, Order1, Order2]
//Added at rear: Order4 -> [Order3, Order1, Order2, Order4]
//Removed from front: Order3
//After removal -> [Order1, Order2, Order4]
//Removed from rear: Order4
//After removal -> [Order1, Order2]


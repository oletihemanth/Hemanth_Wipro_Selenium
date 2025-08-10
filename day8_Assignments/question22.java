package day8_Assignments;

//1.	Bank Queue Simulation:
//o	Create a queue of customer names using Queue<String>.
//o	Add 5 customers to the queue.
//o	Serve (remove) customers one by one and print the queue after each removal.

import java.util.LinkedList;
import java.util.Queue;

public class question22 {
    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedList<>();

        bankQueue.add("ram");
        bankQueue.add("sai");
        bankQueue.add("kumar");
        bankQueue.add("sophia");
        bankQueue.add("david");

        System.out.println("Initial Queue: " + bankQueue);

        while (!bankQueue.isEmpty()) {
            String servedCustomer = bankQueue.poll(); 
            System.out.println("Serving customer: " + servedCustomer);
            System.out.println("Queue after serving: " + bankQueue);
        }
    }
}

//Initial Queue: [ram, sai, kumar, sophia, david]
//Serving customer: ram
//Queue after serving: [sai, kumar, sophia, david]
//Serving customer: sai
//Queue after serving: [kumar, sophia, david]
//Serving customer: kumar
//Queue after serving: [sophia, david]
//Serving customer: sophia
//Queue after serving: [david]
//Serving customer: david
//Queue after serving: []
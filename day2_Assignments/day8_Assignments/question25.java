package day8_Assignments;

//2.	Print Jobs Priority:
//o	Add different print jobs (String) with priority levels.
//o	Use PriorityQueue to simulate serving high-priority jobs before others.

import java.util.PriorityQueue;
import java.util.Comparator;

class PrintJob {
    String jobName;
    int priority; 

    public PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class question25 {
    public static void main(String[] args) {
        PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(Comparator.comparingInt((PrintJob job) -> job.priority).reversed());

        printQueue.add(new PrintJob("Invoice_Print", 3));
        printQueue.add(new PrintJob("Report_Print", 5));
        printQueue.add(new PrintJob("Email_Attachment_Print", 1));
        printQueue.add(new PrintJob("Presentation_Print", 4));

        System.out.println("Serving print jobs in priority order:");
        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }
    }
}

//Serving print jobs in priority order:
//Printing: Report_Print (Priority: 5)
//Printing: Presentation_Print (Priority: 4)
//Printing: Invoice_Print (Priority: 3)
//Printing: Email_Attachment_Print (Priority: 1)
package day7_Assignments;

//Demonstrate the use of Thread.isAlive() to check thread status.

public class example19 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Thread running...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Thread finished.");
        });

        System.out.println(t.isAlive()); // false
        t.start();
        System.out.println(t.isAlive()); // true
        t.join();
        System.out.println(t.isAlive()); // false
    }
}

//false
//true
//Thread running...
//Thread finished.
//false

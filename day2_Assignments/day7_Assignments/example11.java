package day7_Assignments;

//10  Create a program with multiple threads that access a shared counter without synchronization. Show the race condition

class SharedCounter {
    int count = 0; 
    
    public void increment() {
        count++; 
    }
}

class CounterThread extends Thread {
    private SharedCounter counter;

    public CounterThread(SharedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class example11 {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        // Create multiple threads
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        Thread t3 = new CounterThread(counter);

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.count);
    }
}

//Final Counter Value: 1660
package day7_Assignments;

//11  Solve the above problem using synchronized keyword to prevent race condition.

class SharedCounter1 {
    int count = 0;

   
    public synchronized void increment() {
        count++;
    }
}

class CounterThread1 extends Thread {
    private SharedCounter1 counter;

    public CounterThread1(SharedCounter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class example12 {
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

//Final Counter Value: 1982
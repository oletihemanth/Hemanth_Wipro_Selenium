package day7_Assignments;
/*5  Create a thread and use Thread.yield() to pause and give chance to another thread.
6  Implement a program where two threads print even and odd numbers respectively.
7  Create a program that starts three threads and sets different priorities for them.
8  Write a program to demonstrate Thread.join() – wait for a thread to finish before proceeding.*/

//public class example9 extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//            Thread.yield(); // suggest to the scheduler to switch threads
//        }
//    }
//
//    public static void main(String[] args) {
//    	example9 t1 = new example9();
//        example9 t2 = new example9();
//
//        t1.setName("Thread-1");
//        t2.setName("Thread-2");
//
//        t1.start();
//        t2.start();
//    }
//}

//class EvenThread extends Thread {
//    public void run() {
//        for (int i = 2; i <= 10; i += 2) {
//            System.out.println("Even: " + i);
//        }
//    }
//}
//
//class OddThread extends Thread {
//    public void run() {
//        for (int i = 1; i < 10; i += 2) {
//            System.out.println("Odd: " + i);
//        }
//    }
//}
//
//public class example9 {
//    public static void main(String[] args) {
//        EvenThread even = new EvenThread();
//        OddThread odd = new OddThread();
//
//        even.start();
//        odd.start();
//    }
//}

//class PriorityThread extends Thread {
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
//    }
//}
//
//public class example9 {
//    public static void main(String[] args) {
//        PriorityThread t1 = new PriorityThread();
//        PriorityThread t2 = new PriorityThread();
//        PriorityThread t3 = new PriorityThread();
//
//        t1.setName("LowPriority");
//        t2.setName("NormalPriority");
//        t3.setName("HighPriority");
//
//        t1.setPriority(Thread.MIN_PRIORITY);   // 1
//        t2.setPriority(Thread.NORM_PRIORITY);  // 5
//        t3.setPriority(Thread.MAX_PRIORITY);   // 10
//
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}

class JoinDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Running: " + i);
        }
    }
}

public class example9 {
    public static void main(String[] args) {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.start();
        try {
            t1.join(); // wait for t1 to finish before t2 starts
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}




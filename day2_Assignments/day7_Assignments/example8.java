package day7_Assignments;

//1 Write a program to create a thread by extending the Thread class and print numbers from 1 to 5.
//2 Create a thread by implementing the Runnable interface that prints the current thread name.
//3  Write a program to create two threads, each printing a different message 5 times.
//4 Demonstrate the use of Thread.sleep() by pausing execution between numbers from 1 to 3.

//class example8 extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Number: " + i);
//        }
//    }
//
//    public static void main(String[] args) {
//        example8 t1 = new example8();
//        t1.start(); // starts the thread and calls run()
//    }
//}

//class example8 implements Runnable {
//    public void run() {
//        System.out.println("Running in thread: " + Thread.currentThread().getName());
//    }
//
//    public static void main(String[] args) {
//    	example8 runnable = new example8();
//        Thread t1 = new Thread(runnable);
//        t1.setName("MyRunnableThread");
//        t1.start();
//    }
//}

//class MessageThread1 extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Thread 1: Hello!");
//        }
//    }
//}
//
//class MessageThread2 extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Thread 2: Welcome!");
//        }
//    }
//}
//
//public class example8 {
//    public static void main(String[] args) throws InterruptedException {
//        MessageThread1 t1 = new MessageThread1();
//        MessageThread2 t2 = new MessageThread2();
//
//        t1.start();
//        t2.join();
//        t2.start();
//        t1.join();
//    }
//}


public class example8 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        example8 t = new example8();
        t.start();
    }
}



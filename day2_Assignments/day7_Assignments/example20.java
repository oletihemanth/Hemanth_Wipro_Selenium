package day7_Assignments;

//Write a program to demonstrate thread group creation and management.

public class example20 {
    public static void main(String[] args) {
        // Create a ThreadGroup
        ThreadGroup group = new ThreadGroup("MyGroup");

        // Create threads in the group
        Thread t1 = new Thread(group, () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " running");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }, "Thread-1");

        Thread t2 = new Thread(group, () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " running");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }, "Thread-2");

  
        t1.start();
        t2.start();

        // Show group info
        System.out.println("Active threads in group: " + group.activeCount());
        System.out.println("Thread Group Name: " + group.getName());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println("All threads finished.");
    }
}

//Active threads in group: 2
//Thread Group Name: MyGroup
//Thread-2 running
//Thread-1 running
//Thread-1 running
//Thread-2 running
//Thread-1 running
//Thread-2 running
//All threads finished.
package day7_Assignments;

//Create a daemon thread that runs in background and prints time every second

import java.time.LocalTime;

public class example18 {
    public static void main(String[] args) {
        Thread clockThread = new Thread(() -> {
            while (true) {
                System.out.println("Current Time: " + LocalTime.now());
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        clockThread.setDaemon(true); 
        clockThread.start();

        System.out.println("Main thread running for 5 seconds...");
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished. Daemon will stop automatically.");
    }
}

//Main thread running for 5 seconds...
//Current Time: 23:21:57.319774
//Current Time: 23:21:58.332139400
//Current Time: 23:21:59.345334600
//Current Time: 23:22:00.357412700
//Current Time: 23:22:01.367632500
//Main thread finished. Daemon will stop automatically.


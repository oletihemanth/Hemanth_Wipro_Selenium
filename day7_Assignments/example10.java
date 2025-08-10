package day7_Assignments;
//9  Show how to stop a thread using a boolean flag.


class example10 extends Thread {
    private boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println("Thread stopped.");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) {
    	example10 t = new example10();
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        t.stopRunning(); // stop the thread using flag
    }
}

//Thread running...
//Thread running...
//Thread running...
//Thread running...
//Thread stopped.
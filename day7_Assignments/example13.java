package day7_Assignments;


//12  Write a Java program using synchronized block to ensure mutual exclusion.

class SharedPrinter {
    public void printNumbers(int num) {
      
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("----------------------");
        }
    }
}

class MyThread extends Thread {
    private SharedPrinter printer;
    private int num;

    public MyThread(SharedPrinter printer, int num) {
        this.printer = printer;
        this.num = num;
    }

    @Override
    public void run() {
        printer.printNumbers(num);
    }
}

public class example13 {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread t1 = new MyThread(printer, 2);
        Thread t2 = new MyThread(printer, 5);

        t1.start();
        t2.start();
    }
}


//2
//4
//6
//8
//10
//----------------------
//5
//10
//15
//20
//25
//----------------------

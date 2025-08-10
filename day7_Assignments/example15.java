package day7_Assignments;

//Create a Producer-Consumer problem using wait() and notify().


class Buffer {
 private int data;
 private boolean empty = true;

 public synchronized void produce(int value) {
     while (!empty) { 
    	 try {
             wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     data = value;
     empty = false;
     System.out.println("Produced: " + value);
     notify(); 
 }

 public synchronized int consume() {
     while (empty) { 
         try {
             wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     empty = true;
     System.out.println("Consumed: " + data);
     notify(); 
     return data;
 }
}

class Producer extends Thread {
 private Buffer buffer;

 public Producer(Buffer buffer) {
     this.buffer = buffer;
 }

 public void run() {
     for (int i = 1; i <= 5; i++) {
         buffer.produce(i);
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

class Consumer extends Thread {
 private Buffer buffer;

 public Consumer(Buffer buffer) {
     this.buffer = buffer;
 }

 public void run() {
     for (int i = 1; i <= 5; i++) {
         buffer.consume();
         try {
             Thread.sleep(800); 
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Main Class
public class example15 {
 public static void main(String[] args) {
     Buffer buffer = new Buffer();
     Producer producer = new Producer(buffer);
     Consumer consumer = new Consumer(buffer);

     producer.start();
     consumer.start();
 }
}



//Produced: 1
//Consumed: 1
//Produced: 2
//Consumed: 2
//Produced: 3
//Consumed: 3
//Produced: 4
//Consumed: 4
//Produced: 5
//Consumed: 5
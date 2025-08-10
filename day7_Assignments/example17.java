package day7_Assignments;

//16  Write a program that demonstrates inter-thread communication using wait() and notifyAll().

class Message {
    private String content;
    private boolean empty = true;

    public synchronized void write(String msg) {
        while (!empty) { // Wait until message is read
            try { wait(); } catch (InterruptedException e) {}
        }
        content = msg;
        empty = false;
        System.out.println("Written: " + msg);
        notifyAll(); // Notify all waiting threads
    }

    public synchronized String read() {
        while (empty) { // Wait until message is written
            try { wait(); } catch (InterruptedException e) {}
        }
        empty = true;
        System.out.println("Read: " + content);
        notifyAll(); // Notify all waiting threads
        return content;
    }
}

public class example17 {
    public static void main(String[] args) {
        Message msg = new Message();

        Thread writer = new Thread(() -> {
            String[] messages = {"Hello", "How are you?", "Bye"};
            for (String m : messages) {
                msg.write(m);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        Thread reader1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                msg.read();
            }
        });

        Thread reader2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                msg.read();
            }
        });

        writer.start();
        reader1.start();
        reader2.start();
    }
}

//Written: Hello
//Read: Hello
//Written: How are you?
//Read: How are you?
//Written: Bye
//Read: Bye

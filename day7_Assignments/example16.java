package day7_Assignments;

//15  Create a program where one thread prints A-Z and another prints 1-26 alternately.


class Printer {
    boolean letterTurn = true;

    synchronized void printLetter(char ch) throws InterruptedException {
        while (!letterTurn) wait();
        System.out.print(ch + " ");
        letterTurn = false;
        notify();
    }

    synchronized void printNumber(int num) throws InterruptedException {
        while (letterTurn) wait();
        System.out.print(num + " ");
        letterTurn = true;
        notify();
    }
}

public class example16 {
    public static void main(String[] args) {
        Printer p = new Printer();

        Thread t1 = new Thread(() -> {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                try { p.printLetter(ch); } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                try { p.printNumber(i); } catch (Exception e) {}
            }
        });

        t1.start();
        t2.start();
    }
}
//A 1 B 2 C 3 D 4 E 5 F 6 G 7 H 8 I 9 J 10 K 11 L 12 M 13 N 14 O 15 P 16 Q 17 R 18 S 19 T 20 U 21 V 22 W 23 X 24 Y 25 Z 26 
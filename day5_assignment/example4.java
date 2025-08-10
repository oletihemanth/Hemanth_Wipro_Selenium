package day5_assignment;
//Contract Programming: Printer Switch
//•	Declare an interface Printer with method void print(String document).
//•	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
//•	In the client code, declare Printer p;, switch implementations at runtime, and test printing.


interface Printer {
 void print(String document);
}

class LaserPrinter implements Printer {
 @Override
 public void print(String document) {
     System.out.println("[LaserPrinter] Printing in high quality: " + document);
 }
}

class InkjetPrinter implements Printer {
 @Override
 public void print(String document) {
     System.out.println("[InkjetPrinter] Printing in color: " + document);
 }
}

public class example4 {
 public static void main(String[] args) {
     Printer p;
     p = new LaserPrinter();
     p.print("Project Report");
     p = new InkjetPrinter();
     p.print("Holiday Photos");
 }
}

//[LaserPrinter] Printing in high quality: Project Report
//[InkjetPrinter] Printing in color: Holiday Photos
package day4_Assignment;


class Hospital1 {
 void showInfo() {
     System.out.println("Welcome to the Hospital");
 }
}

class Doctor extends Hospital1 {
 void doctorInfo() {
     System.out.println("Doctors treat patients.");
 }
}

class Nurse extends Hospital1 {
 void nurseInfo() {
     System.out.println("Nurses assist doctors and care for patients.");
 }
}

class Accountant extends Hospital1 {
 void accountantInfo() {
     System.out.println("Accountants manage hospital finances.");
 }
}

class Gynac extends Doctor {
 void show() {
     System.out.println("Gynac: Specializes in gynecology.");
 }
}

class Endo extends Doctor {
 void show() {
     System.out.println("Endo: Specializes in endocrinology.");
 }
}

class Cardiac extends Doctor {
 void cardiacInfo() {
     System.out.println("Cardiac: Specializes in heart care.");
 }
}

class Operation extends Cardiac {
 void show() {
     System.out.println("Performs heart surgeries.");
 }
}

class OPD extends Cardiac {
 void show() {
     System.out.println("Conducts outpatient heart consultations.");
 }
}

//Second-level subclasses under Accountant
class Payments extends Accountant {
 void show() {
     System.out.println("Handles all patient payments.");
 }
}

class Documentation extends Accountant {
 void show() {
     System.out.println("Maintains all patient records.");
 }
}

//Main class
public class example11 {
 public static void main(String[] args) {
     
     Gynac g = new Gynac();
     g.showInfo();
     g.doctorInfo();
     g.show();

     System.out.println("-------------------");

     Operation op = new Operation();
     op.showInfo();
     op.doctorInfo();
     op.cardiacInfo();
     op.show();

     System.out.println("-------------------");

     Payments p = new Payments();
     p.showInfo();
     p.accountantInfo();
     p.show();
 }
}


//Welcome to the Hospital
//Doctors treat patients.
//Gynac: Specializes in gynecology.
//-------------------
//Welcome to the Hospital
//Doctors treat patients.
//Cardiac: Specializes in heart care.
//Performs heart surgeries.
//-------------------
//Welcome to the Hospital
//Accountants manage hospital finances.
//Handles all patient payments.


//3.	Create a Bank class with a method getInterestRate()create subclasses:SBIreturn 6.7%  ICICIreturn 7.0%  HDFCreturn 7.5%
package day4_Assignment;

class Bank {
    double getInterestRate() {
        return 0.0;
    }
}
class SBI extends Bank {
    double getInterestRate() {
        return 6.7;
    }
}
class ICICI extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}
class HDFC extends Bank {
    double getInterestRate() {
        return 7.5;
    }
}
public class example3 {
    public static void main(String[] args) {
        SBI b1 = new SBI();
        ICICI b2 = new ICICI();
        HDFC b3 = new HDFC();
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b3.getInterestRate() + "%");
    }
}
//SBI Interest Rate: 6.7%
//ICICI Interest Rate: 7.0%
//HDFC Interest Rate: 7.5%

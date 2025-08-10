package day4_Assignment;
//3.	Create Hospital super class and access this class inside the patient child class and access properties from Hospital class.
class Hospital {
    String hospitalName = "CityCare Hospital";
    String location = "Hyderabad";
    void showHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}

class Patient extends Hospital {
    String patientName;
    int patientAge;
    Patient(String name, int age) {
        this.patientName = name;
        this.patientAge = age;
    }
    void showPatientInfo() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Treated at: " + hospitalName + ", " + location);
    }
}

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient("Jaan", 30);
        p.showPatientInfo();
        p.showHospitalInfo();
	}

}

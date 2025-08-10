package day8_Assignments;

//1.	Hospital Emergency Queue:
//o	Create a class Patient with fields: name and severityLevel (int).
//o	Use PriorityQueue<Patient> with a comparator to serve the most critical patients first (highest severityLevel).

import java.util.PriorityQueue;
import java.util.Comparator;


class Patient {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}

public class question24 {
    public static void main(String[] args) {
   
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severityLevel).reversed()
        );
        emergencyQueue.add(new Patient("John", 4));
        emergencyQueue.add(new Patient("Alice", 9));
        emergencyQueue.add(new Patient("Bob", 6));
        emergencyQueue.add(new Patient("Diana", 8));
        emergencyQueue.add(new Patient("Charlie", 2));

        System.out.println("Emergency Queue: " + emergencyQueue);

        while (!emergencyQueue.isEmpty()) {
            Patient patient = emergencyQueue.poll(); 
            System.out.println("Serving patient: " + patient);
            System.out.println("Remaining queue: " + emergencyQueue);
        }
    }
}

//Emergency Queue: [Alice (Severity: 9), Diana (Severity: 8), Bob (Severity: 6), John (Severity: 4), Charlie (Severity: 2)]
//Serving patient: Alice (Severity: 9)
//Remaining queue: [Diana (Severity: 8), John (Severity: 4), Bob (Severity: 6), Charlie (Severity: 2)]
//Serving patient: Diana (Severity: 8)
//Remaining queue: [Bob (Severity: 6), John (Severity: 4), Charlie (Severity: 2)]
//Serving patient: Bob (Severity: 6)
//Remaining queue: [John (Severity: 4), Charlie (Severity: 2)]
//Serving patient: John (Severity: 4)
//Remaining queue: [Charlie (Severity: 2)]
//Serving patient: Charlie (Severity: 2)
//Remaining queue: []

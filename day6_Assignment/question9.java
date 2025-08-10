//Priority Levels with Extra Data
//Implement enum PriorityLevel with constants (LOW, MEDIUM, HIGH, CRITICAL), each having:
//•	A numeric severity code.
//•	A boolean isUrgent() if severity ≥ some threshold.
//Print descriptions and check urgency.


package day6_Assignment;

enum PriorityLevel {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);

    private final int severityCode;

    PriorityLevel(int severityCode) {
        this.severityCode = severityCode;
    }

    public int getSeverityCode() {
        return severityCode;
    }

    public boolean isUrgent() {
        return severityCode >= 3; // HIGH and CRITICAL are urgent
    }
}

public class question9 {
    public static void main(String[] args) {
        for (PriorityLevel p : PriorityLevel.values()) {
            System.out.println(
                p + " (Severity: " + p.getSeverityCode() + ") " +
                (p.isUrgent() ? "Urgent" : "Not Urgent")
            );
        }
    }
}

//LOW (Severity: 1) Not Urgent
//MEDIUM (Severity: 2) Not Urgent
//HIGH (Severity: 3) Urgent
//CRITICAL (Severity: 4) Urgent
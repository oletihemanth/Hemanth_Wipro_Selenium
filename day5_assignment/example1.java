package day5_assignment;
//Inner Class Encapsulation: Secure Locker
//Encapsulate helper logic inside the class.
//•	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
//•	Use an inner private class SecurityManager to handle passcode verification logic.
//•	Only expose public methods: lock(), unlock(String code), isLocked().
//•	Password attempts should not leak verification logic externally—only success/failure.
//•	Ensure no direct access to passcode or the inner SecurityManager from outside.

class example11 {
    private String lockerId;
    private boolean isLocked;
    private String passcode;

    // Constructor
    public example11(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true; // default: locked
    }

    // Private Inner Class for Security
    private class SecurityManager {
        private boolean verifyPasscode(String input) {
            return passcode.equals(input);
        }
    }

    public void lock() {
        if (!isLocked) {
            isLocked = true;
            System.out.println("Locker " + lockerId + " is now locked.");
        } else {
            System.out.println("Locker " + lockerId + " is already locked.");
        }
    }

    public boolean unlock(String code) {
        SecurityManager sm = new SecurityManager();
        if (sm.verifyPasscode(code)) {
            if (isLocked) {
                isLocked = false;
                System.out.println("Locker " + lockerId + " is now unlocked.");
            } else {
                System.out.println("Locker " + lockerId + " is already unlocked.");
            }
            return true;
        } else {
            System.out.println("Incorrect passcode. Access denied.");
            return false;
        }
    }

    // Public method to check lock status
    public boolean isLocked() {
        return isLocked;
    }
}

// Test Class
public class example1 {
    public static void main(String[] args) {
        example11 locker = new example11("LKR001", "1234");

        System.out.println("Is locked? " + locker.isLocked());

        // Wrong passcode
        locker.unlock("0000");

        // Correct passcode
        locker.unlock("1234");

        // Locking again
        locker.lock();
    }
}


//Is locked? true
//Incorrect passcode. Access denied.
//Locker LKR001 is now unlocked.
//Locker LKR001 is now locked.


//1: Days of the Week
//Define an enum DaysOfWeek with seven constants. Then in main(), prompt the user to input a day name and:
//•	Print its position via ordinal().
//•	Confirm if it's a weekend day using a switch or if-statement.

package day6_Assignment;

import java.util.Scanner;

public class question5 {
    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day of the week (e.g., MONDAY): ");
        String input = sc.nextLine().trim().toUpperCase();

        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println("Position in the week : " + day.ordinal());
            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " is a weekend!");
                    break;
                default:
                    System.out.println(day + " is a weekday.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        sc.close();
    }
}

//Enter a day of the week (e.g., MONDAY): saturday
//Position in the week : 5
//SATURDAY is a weekend!

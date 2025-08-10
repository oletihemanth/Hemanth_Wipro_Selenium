//Compass Directions
//Create an enum Direction with the values NORTH, SOUTH, EAST, WEST. Write code to:
//•	Read a Direction from a string using valueOf().
//•	Use switch or if to print movement (e.g. “Move north”).
//Test invalid inputs with proper error handling.

package day6_Assignment;

import java.util.Scanner;

public class question6 {

    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a direction (NORTH, SOUTH, EAST, WEST): ");
        String str = sc.nextLine().trim().toUpperCase(); 

        try {
            Direction dir = Direction.valueOf(str);

            switch (dir) {
                case NORTH:
                    System.out.println("Move north");
                    break;
                case SOUTH:
                    System.out.println("Move south");
                    break;
                case EAST:
                    System.out.println("Move east");
                    break;
                case WEST:
                    System.out.println("Move west");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        sc.close();
    }
}

//Enter a direction (NORTH, SOUTH, EAST, WEST): west
//Move west
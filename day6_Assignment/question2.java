//2.	Convert an int to String using String.valueOf(...), then back with Integer.parseInt(...). Handle NumberFormatException.
package day6_Assignment;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            String str = String.valueOf(num);
            System.out.println("Integer as String: \"" + str + "\"");
            int parsednum = Integer.parseInt(str);
            System.out.println("String back to int: " + parsednum);
            System.out.print("\nEnter a non-numeric string to see exception handling: ");
            sc.nextLine(); 
            String str1 = sc.nextLine();
            int num1 = Integer.parseInt(str1); 
            System.out.println("Parsed value: " + num1);

        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        sc.close();
    }
}

//Enter an integer: 12
//Integer as String: "12"
//String back to int: 12
//
//Enter a non-numeric string to see exception handling: kjhgf
//java.lang.NumberFormatException: For input string: "kjhgf"


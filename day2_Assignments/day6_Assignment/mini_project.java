//Mini Project – Temperature Converter 
//1.	Prompt user for a temperature in Celsius (double).
//2.	Convert it to Fahrenheit:
//double fahrenheit = celsius * 9/5 + 32;
//3.	Then cast that fahrenheit to int for display.
//4.	Print both the precise (double) and truncated (int) values, and comment on precision loss.

package day6_Assignment;

import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double d = celsius * 9 / 5 + 32;
        int a = (int) d; 

        System.out.println( d);
        System.out.println( a);

        
        
        sc.close();
    }
}
//Enter temperature in Celsius: 23.0
//73.4
//73
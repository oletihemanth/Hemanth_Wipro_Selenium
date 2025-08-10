package day8_Assignments;

//1.	Palindrome Checker:
//o	Input a string and check if it is a palindrome using a Deque<Character>.

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", ""); 

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

//Enter a string: hello
//Not a palindrome

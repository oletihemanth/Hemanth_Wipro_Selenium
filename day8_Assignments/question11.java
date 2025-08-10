package day8_Assignments;

//•	Create a Stack of integers and:
//•	Push 5 elements.
//•	Pop the top element.
//•	Peek the current top.
//•	Check if the stack is empty.
//•	Reverse a string using Stack:
//•	Input a string from the user.
//•	Use a stack to reverse and print the string.

import java.util.Stack;
import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
      
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing 5 elements: " + stack);

        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        int top = stack.peek();
        System.out.println("Current top element: " + top);

        System.out.println("Is stack empty? " + stack.isEmpty());

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a string to reverse: ");
        String input = scanner.nextLine();

        Stack<Character> charStack = new Stack<>();

        for (char ch : input.toCharArray()) {
            charStack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversed.append(charStack.pop());
        }

        System.out.println("Reversed string: " + reversed.toString());

        scanner.close();
    }
}

//Stack after pushing 5 elements: [10, 20, 30, 40, 50]
//Popped element: 50
//Current top element: 40
//Is stack empty? false
//
//Enter a string to reverse: hello
//Reversed string: olleh
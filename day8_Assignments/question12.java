package day8_Assignments;

//•	Use Stack to check for balanced parentheses in an expression.
//•	Input: (a+b) * (c-d)
//•	Output: Valid or Invalid expression
//•	Convert a decimal number to binary using Stack.

import java.util.Stack;
import java.util.Scanner;

public class question12 {

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        if (num == 0) return "0";

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression to check parentheses: ");
        String expression = sc.nextLine();
        if (isBalanced(expression)) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Invalid expression");
        }

        System.out.print("Enter a decimal number to convert to binary: ");
        int decimal = sc.nextInt();
        System.out.println("Binary representation: " + decimalToBinary(decimal));

        sc.close();
    }
}

//Enter expression to check parentheses: ({})
//Valid expression
//Enter a decimal number to convert to binary: 2
//Binary representation: 10

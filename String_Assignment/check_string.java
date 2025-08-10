package String_Assignment;

public class check_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a string: ");
        String input = "Hema198&  9@";

        int letters = 0, digits = 0, spaces = 0, special = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                special++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special);
	}

}

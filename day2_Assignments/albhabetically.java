package String_Assignment;

import java.util.Arrays;

public class albhabetically {

	public static void main(String[] args) {
		String input="cbdafe";
		input = input.toLowerCase();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        System.out.println("Sorted String: " + sortedString);
	}

}

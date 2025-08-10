//Reverse CharSequence: Custom BackwardSequence
//•	Create a class BackwardSequence that implements java.lang.CharSequence.
//•	Internally store a String and implement all required methods: length(), charAt(), subSequence(), and toString().
//•	The sequence should be the reverse of the stored string (e.g., new BackwardSequence("hello") yields "olleh").
//•	Write a main() method to test each method.

package day5_assignment;

public class example2 implements CharSequence {
    private final String reversed;

    public example2(String original) {
        if (original == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
     
        this.reversed = new StringBuilder(original).reverse().toString();
    }

    @Override
    public int length() {
        return reversed.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return reversed.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid subsequence range");
        }
        return reversed.substring(start, end);
    }

    @Override
    public String toString() {
        return reversed;
    }

    public static void main(String[] args) {
        example2 seq = new example2("hello");

        System.out.println("Full reversed string: " + seq); // olleh
        System.out.println("Length: " + seq.length()); // 5
        System.out.println("Char at index 1: " + seq.charAt(1)); // l
        System.out.println("Subsequence(1, 4): " + seq.subSequence(1, 4)); // lle

        
    }
}


//Full reversed string: olleh
//Length: 5
//Char at index 1: l
//Subsequence(1, 4): lle
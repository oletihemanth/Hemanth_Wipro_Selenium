package day7_Assignments;
//Wrapper classes
//1.	Check if character is a Digit
//2.	Compare two Strings
//3.	Convert using valueof method
//4.	Create Boolean Wrapper usage
//5.	Convert null to wrapper classes

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		System.out.println(Character.isDigit(ch));
		String str1="Hello";
		String str2="Hello";
		boolean str3=str1.equals(str2);
		System.out.println(str3);
		String str="3.1423d";
		Double d=Double.valueOf(str);
		System.out.println(d);
		Integer a = null;
        Boolean b = null;

        System.out.println("Integer object: " + a);
        System.out.println("Boolean object: " + b);
        try {
            int x = a; // unboxing null to int
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e);
        }

        try {
            boolean y = b; // unboxing null to boolean
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e);
        }
	}

}

//false
//true
//3.1423
//Integer object: null
//Boolean object: null
//Caught Exception: java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "a" is null
//Caught Exception: java.lang.NullPointerException: Cannot invoke "java.lang.Boolean.booleanValue()" because "b" is null


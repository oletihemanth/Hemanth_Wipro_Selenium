package String_Assignment;
//Check if a string is Palindrome 

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Madam";
		String str1=str.toLowerCase();
		String rev=new StringBuilder(str1).reverse().toString();
		if(str1.equals(rev))
		{
			System.out.println("The given String is Palindrome");
		}
		else
		{
			System.out.println("The given String is Not a Palindrome");
		}
		
	}

}

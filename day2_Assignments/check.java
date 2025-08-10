package String_Assignment;
//Check if String  starts with “j” and end with “a” . eg. “java” 

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		str=str.toLowerCase();
		if(str.startsWith("j")&&str.endsWith("a"))
		{
			System.out.println("String matches");
		}
		else
		{
			System.out.println("String not matches");
		}
	}

}

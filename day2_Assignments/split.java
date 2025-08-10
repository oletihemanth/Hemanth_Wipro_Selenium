package String_Assignment;
//Split a sentence into words 

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="OLETI HEMANTH SATEESH KUMAR";
		String[] words=name.trim().split("\\s+");
		for(String word:words)
		{
			System.out.println(word);
		}
		
	}

}

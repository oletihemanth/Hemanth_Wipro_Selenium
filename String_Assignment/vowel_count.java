package String_Assignment;
//Count number of vowels in a string(input=”Programming”, output=3 Vowels) 

public class vowel_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hemanth";
		int c=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				c++;
			}
		}
		System.out.println("Vowels are "+c);
	}

}

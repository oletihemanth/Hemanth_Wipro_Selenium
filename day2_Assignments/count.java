package String_Assignment;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hemanth sateesh kumar";
		String [] words=name.trim().split("\\s+");
		int count=words.length;
		System.out.println(count);
	}

}

package day7_Assignments;
//7.	Create a program to show that Java is strictly "call by value" even when passing objects (object references are passed by value).
class Child
{
	String name;
}
public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.name="Hemanth";
		System.out.println(c.name);
		after(c);
		System.out.println(c.name);
		
	}
	static void after(Child c)
	{
		c=new Child();
		c.name="Babu";
		System.out.println(c.name);
	}

}
//Hemanth
//Babu
//Hemanth
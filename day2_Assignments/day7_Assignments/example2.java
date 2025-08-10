package day7_Assignments;
//5.	Write a Java program to pass an object to a method and modify its internal fields. Verify that the changes reflect outside the method.
class person
{
	String name;
	int age;
}
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.name="Sai";
		p.age=22;
		System.out.println("Before calls a method....");
		System.out.println("Name  :"+p.name);
		System.out.println("Age  :"+p.age);
		
		change(p);
		
		System.out.println("After calls a method....");
		System.out.println("Name  :"+p.name);
		System.out.println("Age  :"+p.age);
	}
	static void change(person p)
	{
		p.name="Ram";
		p.age=21;
	}

}

//Before calls a method....
//Name  :Sai
//Age  :22
//After calls a method....
//Name  :Ram
//Age  :21
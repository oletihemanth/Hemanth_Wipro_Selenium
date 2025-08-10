//1. Student with Grade Validation & Configuration
//Ensure marks are always valid and immutable once set.
//•	Create a Student class with private fields: name, rollNumber, and marks.
//•	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
//•	Provide getter methods, but no setter for marks (immutable after object creation).
//•	Add displayDetails() to print all fields.
/*In future versions, you might allow updating marks only via a special inputMarks(int newMarks) method that has stricter logic (e.g. cannot reduce marks). Design accordingly.
*/
package day5_assignment;

public class Student {
	private String name;
	private int rollno;
	private long marks;
	public Student(String name,int rollno,long marks) {
		this.name=name;
		this.rollno=rollno;
		if(marks>=0&&marks<=100)
		{
			this.marks=marks;
		}
		else
		{
			System.out.println("Invalid Marks "+marks);
		}
	}
	public String getname()
	{
		return name;
	}
	public int getrollno()
	{
		return rollno;
	}
	public long getmarks()
	{
		return marks;
	}
	public void inputMarks(int newMarks) {
	      if (newMarks > this.marks && newMarks <= 100) { 
	      this.marks = newMarks;
	      System.out.println("Marks for " + name + " updated to: " + newMarks);
	      } else {
	      System.out.println("Could not update marks for " + name + ". New marks must be higher and within 0-100.");
	      }
	}
	public void displayDetails()
	{
		System.out.println("Student Name "+name);
		System.out.println("Student Rollno "+rollno);
		System.out.println("Student Marks "+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Hemanth",10,90);
		Student s2=new Student("Sateesh",11,101);
		Student s3=new Student("Kumar",12,89);
		Student s4=new Student("Sagar",13,-198);
		Student s5=new Student("Anil",14,80);
		
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		s4.displayDetails();
		s5.displayDetails();
		
	}

}

//Invalid Marks 101
//Invalid Marks -198
//Student Name Hemanth
//Student Rollno 10
//Student Marks 90
//Student Name Sateesh
//Student Rollno 11
//Student Marks 0
//Student Name Kumar
//Student Rollno 12
//Student Marks 89
//Student Name Sagar
//Student Rollno 13
//Student Marks 0
//Student Name Anil
//Student Rollno 14
//Student Marks 80
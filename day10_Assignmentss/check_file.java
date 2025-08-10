package day10_Assignmentss;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//•	2. Write a program to check whether a file exists at a given path
public class check_file {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Path path = Paths.get("C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\test.txt"); 
		if(Files.exists(path))
		{
			System.out.println("File is already Exist");
		}
		else
		{
			System.out.println("file not found");
		}
	}

}

package Asserts_demo;

import org.testng.annotations.Test;

public class disableTest_demo {
	
  
  @Test(enabled=true)
  public void nameTest() {
	  System.out.println("Test Case: Name");
  }
  
  @Test(enabled=false)
  public void addressTest() {
	  System.out.println("Test Case: Address");
  }
}

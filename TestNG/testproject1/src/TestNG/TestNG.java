package TestNG;

import org.testng.annotations.Test;

public class TestNG {

	@Test (groups= {"smokeTest"})
public void login()
{
	System.out.println("This is smoke test case");
}
	
	@Test (groups = "funtionalTest")
	public void login2()
	{
		System.out.println("This is functional test case");
	}
		
	
} 	


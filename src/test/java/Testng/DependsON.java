package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsON {
	
	@Test
	public void SendRequest() {
		System.out.println("Sending Friend Request");
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods ="SendRequest")
	public void AcceptRequest() {
		System.out.println("Accepting Friend Request");
		
	}
	
	@Test
	public void login() {
		System.out.println("Enter userid and pass");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = "login")
	public void Loggedin() {
		System.out.println("Correct id and pass then login succesfull");
		
	}

}

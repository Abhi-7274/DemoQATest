package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	
	
	@Test
	public void m1() {
		System.out.println("m1 method");
		}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		
		}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class >> Opening DB Connection");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method ==> Setting Browser Configurations");
		
	}
	
		
//	public void AfterSuite() {
//		System.out.println("After Suite");
//		
//	}
	
	
		
	}



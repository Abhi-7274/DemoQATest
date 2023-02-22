package Testng;

import org.testng.annotations.Test;

public class sequencingpriority {
	@Test
	public void Orange() {
		System.out.println("Orange");
		
	}
	@Test
	public void Jackfruit() {
		System.out.println("jackfruit");
		
	}
	@Test(priority = -1)
	public void Papaya() {
		System.out.println("Papaya");
	}
}
		
	



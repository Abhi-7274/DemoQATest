package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametrization {
	@org.testng.annotations.Parameters({"username","password"})
	@Test
  public void logintest(String username ,String password ) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	
}
	@DataProvider
	public Object[][] getuserdata() {
		Object[][] data = new Object[3][2];
		data[0][0]="admin";
		data[0][1]="admin123";
		
		data[1][0]="hr";
		data[1][1]="hr123";
		
		data[2][0]="finance";
		data[2][1]="finance123";
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		
		System.out.println(data[2][0]);
		System.out.println(data[2][1]);
		return data;
		
		
	}
	
}

package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertiondemo {

	@Test
	 public void validatelink() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.xpath("//p[text()='Forgot your password?']")).click();
		 
//		 add assertion
		 boolean resertpasschceck =driver.findElement(By.xpath("//h6[text()='Reset pPassword']")).isDisplayed();
		 Assert.assertTrue(resertpasschceck);
		 
		 
	}

}

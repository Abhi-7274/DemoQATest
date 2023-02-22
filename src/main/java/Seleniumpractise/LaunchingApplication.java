package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("abhimanyu7274@gmail.com");
		driver.findElement(By.id("email")).sendKeys("9334336025");
		
		driver.findElement(By.id("pass")).sendKeys("abhi7274");
		
		driver.findElement(By.name("login")).click();
		
//		driver.close();
		
		

	}

}

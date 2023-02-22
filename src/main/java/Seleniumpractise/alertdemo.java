package Seleniumpractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html ");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
	
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	
	    
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("abhimanyu");
		driver.switchTo().alert().accept();

	
	
	
	}

}

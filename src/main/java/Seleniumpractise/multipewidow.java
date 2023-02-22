package Seleniumpractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipewidow {
   public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent Window Handle ==> "+driver.getWindowHandle());
		String parentid = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		
		Set<String> windows = driver.getWindowHandles();
		String childwindowid = null;
}
}

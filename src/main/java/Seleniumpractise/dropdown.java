package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	public static void main(String[] args) {
		multidropdown();
		 
	}
     public static void multidropdown() {
    	 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://output.jsbin.com/osebed/2");
			WebElement dropdown = driver.findElement(By.id("fruits"));
			Select obj = new Select(dropdown);
			obj.selectByIndex(2);
			obj.selectByValue("banana");
     }
}

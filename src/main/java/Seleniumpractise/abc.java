package Seleniumpractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
//		WebElement frame = driver.findElements(By.id("mce_0_ifr"));
//		
//		driver.findElements(By.id("tinymce")).sendKeys("abhi7274");
	}

}

package Seleniumpractise;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actiondemo {
	public static void main(String[] args) {
//		Scrolltoelement();
		hover();
	}
	public static void Scrolltoelement() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.in/");
		Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[text()='Bestsellers from women owned businesses']"))).perform();	
		
	}
	public static void hover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement menu = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).perform();		
	}
}

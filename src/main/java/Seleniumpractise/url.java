package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class url {
	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/shop/kids");
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		
		System.out.println("No of urls on the page : " + urls.size());
		
		for(WebElement ele : urls) {
			System.out.println(ele.getText());
			
			System.out.println();
			
		}
		driver.findElement(By.linkText(null));
	}

}

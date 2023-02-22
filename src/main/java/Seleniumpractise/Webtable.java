package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		System.out.println("Rows count ==> "+row.size());
		
		
		
	}

}

package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ola {
	
 public static void main(String[] args) {
	 
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.olacabs.com/");
	 
	 WebElement name = driver.findElement(By.xpath("//*[@id=\"footerContainer\"]/div[1]/div[2]/div[3]/ul/li[1]/a"));
	 
	 driver.findElement(By.xpath("//*[@id=\"footerContainer\"]/div[1]/div[2]/div[3]/ul/li[1]/a")).click();
	 
//	 driver.close();
	
}


}



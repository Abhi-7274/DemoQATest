import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaexecutor {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//span[text()=' Grocery & Gourmet']"));
		js.
	     
}
	
}


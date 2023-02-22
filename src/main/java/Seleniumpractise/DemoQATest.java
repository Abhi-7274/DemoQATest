package Seleniumpractise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class DemoQATest {
    public static void main(String[] args) {
        // Set the system property for the Chrome driver
        System.setProperty("webdriver.chrome.driver", "https://demoqa.com/");
        
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the DemoQA homepage
        driver.get("https://demoqa.com/");
        
        // Get the page title and print it to the console
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        
        // Find the "Elements" menu item and click it
        WebElement elementsMenuItem = driver.findElement(By.xpath("//span[text()='Elements']"));
        elementsMenuItem.click();
        
        // Find the "Text Box" sub-menu item and click it
        WebElement textBoxSubMenu = driver.findElement(By.xpath("//span[text()='Text Box']"));
        textBoxSubMenu.click();
        
        // Find the text box input field and enter some text
        WebElement textBoxInput = driver.findElement(By.id("userName"));
        textBoxInput.sendKeys("Abhimanyu Kumar");
        
        // Find the "Submit" button and click it
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        
        // Get the success message and print it to the console
        WebElement successMessage = driver.findElement(By.id("userForm")).findElement(By.className("text-success"));
        System.out.println("Success message is: " + successMessage.getText());
        
        // Find all the text input fields and print their values to the console
        List<WebElement> textInputs = driver.findElements(By.xpath("//input[@type='text']"));
        for (WebElement input : textInputs) {
            System.out.println("Input value is: " + input.getAttribute("value"));
        }
        
        // Close the browser
        driver.quit();
    }
}





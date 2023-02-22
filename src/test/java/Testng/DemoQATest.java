package Testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "https://demoqa.com/");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
    }

    @Test(priority = 1)
    public void fillForm() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Doe");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("johndoe@example.com");

        WebElement gender = driver.findElement(By.id("gender-radio-1"));
        gender.click();

        WebElement mobile = driver.findElement(By.id("userNumber"));
        mobile.sendKeys("1234567890");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form/?firstname=John&lastname=Doe&gender=Male&mobile=1234567890&email=johndoe%40example.com", "Form submission failed");
    }

    @Test(priority = 2)
    public void verifyForm() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        Assert.assertEquals(firstName.getAttribute("value"), "John", "First name is incorrect");

        WebElement lastName = driver.findElement(By.id("lastName"));
        Assert.assertEquals(lastName.getAttribute("value"), "Doe", "Last name is incorrect");

        WebElement email = driver.findElement(By.id("userEmail"));
        Assert.assertEquals(email.getAttribute("value"), "johndoe@example.com", "Email is incorrect");

        WebElement gender = driver.findElement(By.id("gender-radio-1"));
        Assert.assertTrue(gender.isSelected(), "Gender is incorrect");

        WebElement mobile = driver.findElement(By.id("userNumber"));
        Assert.assertEquals(mobile.getAttribute("value"), "1234567890", "Mobile number is incorrect");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

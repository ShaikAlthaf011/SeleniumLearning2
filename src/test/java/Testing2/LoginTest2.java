package Testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://qaebank.ccbp.tech/ebank/login");
        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.xpath("//input[@id='userIdInput']"));
        element1.sendKeys("142420");
        WebElement element2=driver.findElement(By.xpath("//input[@id='pinInput']"));
        element2.sendKeys("231225");
        WebElement element3=driver.findElement(By.xpath("//button[@type='submit']"));
        element3.click();
        System.out.println("Username Entered");
        System.out.println("Password Entered");
        System.out.println("Submitted login details");

    }
}

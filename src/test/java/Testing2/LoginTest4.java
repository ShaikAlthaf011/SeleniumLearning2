package Testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaebank.ccbp.tech/ebank/login");

        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.xpath("//input[@id='userIdInput']"));
        element1.sendKeys("142420");
        WebElement element2=driver.findElement(By.xpath("//input[@id='pinInput']"));
        element2.sendKeys("231225");
        WebElement  element3=driver.findElement(By.xpath("//button[@type='submit']"));
        element3.submit();

        String expectedUrl="https://qaebank.ccbp.tech/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.urlToBe( expectedUrl));
        String currenturl=driver.getCurrentUrl();
        if(currenturl.equals(expectedUrl)) {
            System.out.println("Login is Successfully");
        }else{
            System.out.println(driver.getCurrentUrl());
        }
        WebElement element5=driver.findElement(By.xpath("//button[@class='logout-button']"));
        element5.click();
        String expectedUrl1="https://qaebank.ccbp.tech/ebank/login";

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe( expectedUrl1));
        String currentUrl=driver.getCurrentUrl();
        if(currentUrl.equals(expectedUrl1)){
            System.out.println("Logout Successfully");
        }

    }
}

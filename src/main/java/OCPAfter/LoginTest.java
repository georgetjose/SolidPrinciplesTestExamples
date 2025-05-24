package OCPAfter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void runTest(Environment env) {
        WebDriver driver = new ChromeDriver();
        driver.get(env.getLoginUrl());

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.id("loginBtn")).click();

        // Add basic assertion or verification as needed
        driver.quit();
    }
}


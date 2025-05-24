package OCPBefore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void runTest(String environment) {
        String baseUrl;

        if (environment.equals("dev")) {
            baseUrl = "https://dev.example.com/login";
        } else if (environment.equals("stage")) {
            baseUrl = "https://stage.example.com/login";
        } else if (environment.equals("prod")) {
            baseUrl = "https://example.com/login";
        } else {
            throw new IllegalArgumentException("Unknown environment");
        }

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.id("loginBtn")).click();
        driver.quit();
    }
}


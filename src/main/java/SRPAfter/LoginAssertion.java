package SRPAfter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginAssertion {
    private WebDriver driver;

    public LoginAssertion(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomeMessage(String expected) {
        String actual = driver.findElement(By.id("welcome")).getText();
        Assert.assertEquals(actual, expected);
    }
}


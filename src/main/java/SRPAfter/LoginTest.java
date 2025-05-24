package SRPAfter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        LoginAssertion loginAssertion = new LoginAssertion(driver);
        loginAssertion.verifyWelcomeMessage("Welcome, Admin!");

        ScreenshotUtil.takeScreenshot(driver, "login_success.png");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


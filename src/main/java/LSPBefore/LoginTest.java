package LSPBefore;

public class LoginTest {
    public void run(TestDriver driver) {
        driver.openUrl("https://example.com/login"); //Will break with ApiDriver
        driver.click("loginBtn");
    }
}


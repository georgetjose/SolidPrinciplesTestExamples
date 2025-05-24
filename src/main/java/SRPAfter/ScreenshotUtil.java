package SRPAfter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenshotUtil {
    public static void takeScreenshot(WebDriver driver, String filename) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Add save logic here using Files.copy...
        System.out.println("Screenshot saved as " + filename);
    }
}


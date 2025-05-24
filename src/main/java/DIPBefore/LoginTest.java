package DIPBefore;

public class LoginTest {
    private ConsoleLogger logger = new ConsoleLogger(); // depends directly on low-level class

    public void runTest() {
        // Simulate login steps
        logger.log("Opening login page...");
        logger.log("Entering credentials...");
        logger.log("Clicked login button.");
        logger.log("Login successful.");
    }
}


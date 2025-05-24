package DIPAfter;

public class LoginTest {
    private Logger logger;

    // Depends on abstraction
    public LoginTest(Logger logger) {
        this.logger = logger;
    }

    public void runTest() {
        logger.log("Opening login page...");
        logger.log("Entering credentials...");
        logger.log("Clicked login button.");
        logger.log("Login successful.");
    }
}


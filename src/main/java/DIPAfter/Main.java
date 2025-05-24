package DIPAfter;

public class Main {
    public static void main(String[] args) {
        // Easily switch logger without changing LoginTest
        Logger logger = new ConsoleLogger(); // or new FileLogger();
        LoginTest test = new LoginTest(logger);
        test.runTest();
    }
}


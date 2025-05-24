package OCPAfter;

public class Main {
    public static void main(String[] args) {
        LoginTest test = new LoginTest();

        // Run test in Dev
        test.runTest(new DevEnvironment());

        // Run test in Stage
        test.runTest(new StageEnvironment());

        // Add new environment without touching test class
        test.runTest(new ProdEnvironment());
    }
}


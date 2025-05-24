package LSPAfter;

public class Main {
    public static void main(String[] args) {
        LoginUITest uiTest = new LoginUITest();
        uiTest.run(new BrowserDriver()); //Works correctly

        // The following is now not allowed:
        // uiTest.run(new ApiTestDriver()); // Compile-time error – which is good!
    }
}


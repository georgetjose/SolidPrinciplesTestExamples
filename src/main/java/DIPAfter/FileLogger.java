package DIPAfter;

public class FileLogger implements Logger {
    public void log(String message) {
        // For demo purposes, just print to simulate file logging
        System.out.println("[File]: " + message + " (written to file)");
    }
}

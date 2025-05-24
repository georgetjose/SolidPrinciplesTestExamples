package LSPAfter;

public class BrowserDriver implements UITestDriver {
    public void openUrl(String url) {
        System.out.println("Opening browser URL: " + url);
    }

    public void click(String elementId) {
        System.out.println("Clicking on: " + elementId);
    }
}


package ISPBefore;

public class LoginPage implements TestActions {
    public void click(String elementId) {
        System.out.println("Clicked on " + elementId);
    }

    public void type(String elementId, String text) {
        System.out.println("Typed '" + text + "' into " + elementId);
    }

    public void sendRequest(String endpoint) {
        // Not relevant for UI, but still forced to implement
        throw new UnsupportedOperationException("Not supported in UI");
    }
}


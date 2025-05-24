package ISPBefore;

public class LoginApi implements TestActions {
    public void click(String elementId) {
        // Not relevant for API
        throw new UnsupportedOperationException("Click not supported in API");
    }

    public void type(String elementId, String text) {
        // Not relevant for API
        throw new UnsupportedOperationException("Type not supported in API");
    }

    public void sendRequest(String endpoint) {
        System.out.println("Sent request to: " + endpoint);
    }
}


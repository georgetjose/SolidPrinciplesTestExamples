package LSPBefore;

public class ApiDriver extends TestDriver {
    @Override
    public void openUrl(String url) {
        throw new UnsupportedOperationException("API driver can't open URLs");
    }

    @Override
    public void click(String elementId) {
        throw new UnsupportedOperationException("API driver can't click elements");
    }

    public void sendRequest(String endpoint) {
        System.out.println("Sending API request to: " + endpoint);
    }
}


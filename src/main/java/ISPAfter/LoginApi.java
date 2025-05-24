package ISPAfter;

public class LoginApi implements Requestable {
    public void sendRequest(String endpoint) {
        System.out.println("Sent API request to: " + endpoint);
    }
}


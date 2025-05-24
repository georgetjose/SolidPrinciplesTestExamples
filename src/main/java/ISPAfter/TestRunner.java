package ISPAfter;

public class TestRunner {
    public static void main(String[] args) {
        Clickable ui = new LoginPage();
        ui.click("loginButton");

        Typable form = new LoginPage();
        form.type("username", "admin");

        Requestable api = new LoginApi();
        api.sendRequest("/login");
    }
}


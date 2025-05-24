package ISPAfter;

public class LoginPage implements Clickable, Typable {
    public void click(String elementId) {
        System.out.println("Clicked on " + elementId);
    }

    public void type(String elementId, String text) {
        System.out.println("Typed '" + text + "' into " + elementId);
    }
}


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Scrolling  extends base{
    public static void main(String[]args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        // no method to scrolling down there for you can used this way
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"webView\"));");
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Auto Complete\"));");

    }
}

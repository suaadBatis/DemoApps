import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;

public class SwipeDemo extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities ();
        driver.findElementByXPath ( "//android.widget.TextView[@text='Views']").click ();
        driver.findElementByXPath ( "//android.widget.TextView[@text='Date Widgets']").click ();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElementByXPath ("//*[@content-desc='9']").click (); // using "//* if the xpath includes any spacial character like $
        TouchAction t = new TouchAction (driver);
        WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement sec = driver.findElementByXPath("//*[@content-desc='45']");
        t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(1))).moveTo( element(sec)).release ().perform ();//for
    }
}


import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.Utils;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class LongPress extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        // here the TouchAction method start
        TouchAction t = new TouchAction(driver);
        // for tapping
        WebElement elementTap=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(tapOptions().withElement(element(elementTap))).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        // long press
        WebElement elementPress = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(longPressOptions().withElement(element(elementPress)).withDuration(ofSeconds(2))).release().perform();//for long tapping
        System.out.println(driver.findElementById("android:id/title").isDisplayed());
        // driver.findElementByXPath("//android.widget.TextView[@text='Sample action']").click();
        // for tapping
        WebElement elementTap2=	driver.findElementByXPath("//android.widget.TextView[@text='Sample action']");
        t.tap(tapOptions().withElement(element(elementTap2))).perform();
        Utils.sleep (10);
    }

}

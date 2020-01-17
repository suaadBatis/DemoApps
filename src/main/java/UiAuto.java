import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAuto extends base{

    public static void main(String[]args) throws MalformedURLException {
    AndroidDriver<AndroidElement> driver =Capabilities();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       //driver.findElementsByAndroidUIAutomator( "@attribute=value");
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("(text(\"Views\")").click();
         driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
    }
}

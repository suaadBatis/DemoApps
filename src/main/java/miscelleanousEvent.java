import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscelleanousEvent extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.currentActivity());
        System.out.println(driver.getContext());
        System.out.println(driver.getOrientation());
        System.out.println(driver.isDeviceLocked());
        //  driver.hideKeyboard(); no need to hide the keyboard here
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

}

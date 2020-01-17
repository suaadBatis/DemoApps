
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class FirstClass extends base {
    public static void main(String[]args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver =Capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click ();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click ();
        driver.findElementById("android:id/checkbox").click ();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys( "Hello i am soso" );
        //driver.findElementByXPath("//android.widget.Button[@text='OK']").click ();
        //driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        //driver.findElementByXPath("//android.widget.Button[@text='CANCEL']").click ();
        driver.findElementsByClassName("android.widget.Button").get(1).click ();
        //driver.findElementsByClassName("android.widget.Button").get(0).click ();
        driver.quit ();
    }
}

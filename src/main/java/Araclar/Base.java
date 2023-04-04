package Araclar;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.net.URL;

public class Base{
    public AppiumDriver driver;
    public WebDriverWait wait;
    //@BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","GK");
        caps.setCapability("version","9.0");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","C:\\Users\\muamm\\Desktop\\apk\\0374d0c2-facc-4f16-a241-f71392c28acc(1).apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver,10);
    }

    //@After
    public void tearDown(){
        driver.getClass();
    }
    //denemeeeeeeeeeeeeeeeee
}

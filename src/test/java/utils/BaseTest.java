package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by arun on 06/07/2018.
 */
public class BaseTest {


    public AppiumDriver driver;
    DesiredCapabilities caps;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.daft.ie");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.daft.ie.ui.main.MainActivity");
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/build/daftandroid.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

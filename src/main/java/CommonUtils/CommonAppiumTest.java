package CommonUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by arun on 06/07/2018.
 */
public class CommonAppiumTest {

    public WebDriverWait wait;
    public AppiumDriver driver;


    public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public  void waitForElement(AppiumDriver driver, MobileElement id){
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions
                .elementToBeClickable(id));
    }

    public void waitForElementToAppear(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}

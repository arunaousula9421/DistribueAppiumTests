package pages;

import CommonUtils.CommonAppiumTest;
import io.appium.java_client.MobileElement;
import pageobjects.WelcomePageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by arun on 06/07/2018.
 */
public class WelcomePage extends CommonAppiumTest{

    WelcomePageObjects welcomePageObjects = new WelcomePageObjects();


    public WelcomePage(AppiumDriver<MobileElement> driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), welcomePageObjects);
    }

    public WelcomePage waitForWelcomePage(){
        waitForElement(driver,welcomePageObjects.welcomeHeader);
        return this;
    }

    public void validateUser(){
        String username = welcomePageObjects.welcomeHeader.getText();
        Assert.assertEquals(username, "Hi, Arunkumar");
    }

    public LoginPage clickLoginBtn(){
        welcomePageObjects.loginBtn.click();
        return new LoginPage(driver);
    }

    public SearchPage clickSearchBtn(){
        welcomePageObjects.searchBtn.click();
        return new SearchPage(driver);
    }
}

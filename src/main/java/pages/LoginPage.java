package pages;


import CommonUtils.CommonAppiumTest;
import io.appium.java_client.MobileElement;
import pageobjects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by arun on 06/07/2018.
 */
public class LoginPage extends CommonAppiumTest{

    LoginPageObjects loginPageObjects;

    public LoginPage(AppiumDriver<MobileElement> driver){
        super(driver);
        loginPageObjects = new LoginPageObjects();
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
    }

    public WelcomePage enterUserCredentials(){
        loginPageObjects.userName.sendKeys("arunaousula");
        loginPageObjects.passWord.sendKeys("dsch9421");
        loginPageObjects.signIn.click();
        return new WelcomePage(driver);
    }
}
